from PyQt5 import QtWidgets
import GUI.interface
from GUI.audentification import Ui_Dialog
from GUI.registraition import Ui_Regis
import sys
import sqlite3


class Audentification(QtWidgets.QWidget, Ui_Dialog):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.closeButton.clicked.connect(self.close)
        self.okButton.clicked.connect(self.audent)

    def audent(self):
        login = self.loginEdit.text()
        password = self.PasswordEdit.text()

        connect = sqlite3.connect('db/users.db')
        cursor = connect.cursor()
        


        login1 = None
        password1 = None
        self.close()


class Registration(QtWidgets.QWidget, Ui_Regis):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.closeButton.clicked.connect(self.close)
        self.okButton.clicked.connect(self.regist)

    def regist(self):
        login = self.loginEdit.text()
        password = self.passwordEdit.text()
        password_nonf = self.linepasswordEdit_1.text()
        if password == password_nonf:
            print(login, '',  password)
            connect = sqlite3.connect('db/users.db')
            cursor = connect.cursor()
            cursor.execute('''
            CREATE TABLE IF NOT EXISTS Users(
            id INTEGER PRIMARY KEY,
            login TEXT  NOT NULL,
            password TEXT NOT NULL)''')
            cursor.execute('INSERT INTO Users (login, password) VALUES (?, ?)', (login, password))
            connect.commit()
            connect.close()
            self.close()

        else:
            self.linepasswordEdit_1.setText("Пароли не совпадают")




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
