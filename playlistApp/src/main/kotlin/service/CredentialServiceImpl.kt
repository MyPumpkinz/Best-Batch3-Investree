package service

import database.UserDatabase
import database.UserDatabaseImpl
import model.UserData

class CredentialServiceImpl : CredentialService {

    private var database: UserDatabase = UserDatabaseImpl()
    private var loggedInUser: UserData? = null

    override fun doLogin(username: String, password: String): UserData? {
        if (username.isEmpty() || password.isEmpty()) {
            println("username dan password tidak boleh kosong")
            return null
        }

        val userData: UserData? = database.findUser(username)
        if (userData == null) {
            println("user tidak ditemukan")
            return null
        }
        if (!userData.password.equals(password, true)) {
            println("password tidak sama")
            return null
        }
        println("user berhasil login")
        loggedInUser = userData
        return userData
    }

    override fun getLoggedInUser(): UserData? = loggedInUser


    override fun doRegister() {}

}