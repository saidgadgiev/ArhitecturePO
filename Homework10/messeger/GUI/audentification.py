# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file '.\audentification.ui'
#
# Created by: PyQt5 UI code generator 5.15.9
#
# WARNING: Any manual changes made to this file will be lost when pyuic5 is
# run again.  Do not edit this file unless you know what you are doing.


from PyQt5 import QtCore, QtGui, QtWidgets


class Ui_Dialog(object):
    def setupUi(self, Dialog):
        Dialog.setObjectName("Dialog")
        Dialog.resize(400, 100)
        Dialog.setMinimumSize(QtCore.QSize(400, 100))
        Dialog.setMaximumSize(QtCore.QSize(400, 100))
        self.label = QtWidgets.QLabel(Dialog)
        self.label.setGeometry(QtCore.QRect(30, 20, 47, 13))
        font = QtGui.QFont()
        font.setPointSize(13)
        self.label.setFont(font)
        self.label.setObjectName("label")
        self.label_2 = QtWidgets.QLabel(Dialog)
        self.label_2.setGeometry(QtCore.QRect(26, 50, 61, 21))
        font = QtGui.QFont()
        font.setPointSize(13)
        self.label_2.setFont(font)
        self.label_2.setObjectName("label_2")
        self.loginEdit = QtWidgets.QLineEdit(Dialog)
        self.loginEdit.setGeometry(QtCore.QRect(110, 19, 151, 21))
        font = QtGui.QFont()
        font.setPointSize(13)
        self.loginEdit.setFont(font)
        self.loginEdit.setObjectName("loginEdit")
        self.PasswordEdit = QtWidgets.QLineEdit(Dialog)
        self.PasswordEdit.setGeometry(QtCore.QRect(110, 50, 151, 20))
        font = QtGui.QFont()
        font.setPointSize(13)
        self.PasswordEdit.setFont(font)
        self.PasswordEdit.setObjectName("PasswordEdit")
        self.closeButton = QtWidgets.QPushButton(Dialog)
        self.closeButton.setGeometry(QtCore.QRect(310, 50, 75, 23))
        self.closeButton.setObjectName("closeButton")
        self.okButton = QtWidgets.QPushButton(Dialog)
        self.okButton.setGeometry(QtCore.QRect(310, 10, 75, 23))
        self.okButton.setObjectName("okButton")

        self.retranslateUi(Dialog)
        QtCore.QMetaObject.connectSlotsByName(Dialog)

    def retranslateUi(self, Dialog):
        _translate = QtCore.QCoreApplication.translate
        Dialog.setWindowTitle(_translate("Dialog", "Dialog"))
        self.label.setText(_translate("Dialog", "Логин"))
        self.label_2.setText(_translate("Dialog", "Пароль"))
        self.closeButton.setText(_translate("Dialog", "Выход"))
        self.okButton.setText(_translate("Dialog", "ОК"))
