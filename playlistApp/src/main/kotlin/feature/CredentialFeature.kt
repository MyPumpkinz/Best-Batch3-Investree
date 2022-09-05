package feature

import model.UserData
import service.CredentialService
import service.CredentialServiceImpl
import java.util.*

class CredentialFeature(private val scanner: Scanner) {

    private val credentialService: CredentialService = CredentialServiceImpl()

    fun login() {
        println("Username: ")
        val inputUsername = scanner.nextLine()
        println("Password: ")
        val inputPassword = scanner.nextLine()

        val loggedInUser: UserData? = credentialService.doLogin(inputUsername, inputPassword)
        loggedInUser?.let {
            println("Selamat datang ${it.name}")
        }
    }

    fun getProfile() {
        credentialService.getLoggedInUser()?.let {
            println("Username   : ${it.username}")
            println("NickName   : ${it.name}")
            println("Address    : ${it.address}")
        }
    }

    private fun printUserData(userData: UserData) {
        println("Username   : ${userData.username}")
        println("NickName   : ${userData.name}")
        println("Address    : ${userData.address}")
    }
}