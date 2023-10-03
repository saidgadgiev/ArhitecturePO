from PyQt5.QtWidgets import (QLineEdit, QInputDialog)
from PyQt5 import QtWidgets
import GUI.interface
from GUI.audentification import Ui_Dialog
from GUI.registraition import Ui_Regis
import sys
class Audentification(QtWidgets.QWidget, Ui_Dialog):
    def __init__(self):
        super().__init__()
        self.setupUi(self)

class Registration(QtWidgets.QWidget, Ui_Regis):
    def __init__(self):
        super().__init__()
        self.setupUi(self)

class MyWindow(QtWidgets.QMainWindow):
    def __init__(self):
        super().__init__()
        self.ui = GUI.interface.Ui_MainWindow()
        self.ui.setupUi(self)
        self.ui.authorizationBTN.clicked.connect(self.inputAutorization)
        self.ui.registrationBTN.clicked.connect(self.inputRegistration)

    # Диалоговое окно авторизации
    def inputAutorization(self):
        self.audent = Audentification()
        self.audent.show()

    # Диалоговое окно регистрации
    def inputRegistration(self):
        self.regis = Registration()
        self.regis.show()

    



if __name__ == "__main__":
    app = QtWidgets.QApplication(sys.argv)
    window = MyWindow()
    window.show()
    sys.exit(app.exec_())
