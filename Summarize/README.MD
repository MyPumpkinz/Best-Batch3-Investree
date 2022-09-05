<h3 align="center"><img src="https://github.com/seanprashad/slackmoji/blob/master/emoji/blob/blob-good-night-gif.gif" height="30px"/>Rangkuman Pembelajaran BEST-Intro 1 Batch-3 Investree<img src="https://github.com/seanprashad/slackmoji/blob/master/emoji/blob/blob-good-night-reverse-gif.gif" height="30px"/><br></h3>

Mentor  : Mas Rio Swarawan Putra

Poin Pembahasan:
* Backend
* Java
* Kotlin
* IDE : Eclipse, Netbeans, dan IntelliJ 
* Database : MySql, PostgreSQL, Redis, dan ElasticSearch
* RabbitMq
* CI/CD
* Version Control
* Code Quality Analysis

Rangkuman:

1. Backend <img src="https://img.icons8.com/external-filled-outline-wichaiwi/344/external-backend-jobs-and-occupations-filled-outline-wichaiwi.png" height="20px"/>

    Backend atau server side merupakan seseorang yang berada di balik layar untuk memastikan suatu aplikasi berjalan seperti semestinya. Orang-orang yang ada dalam Backend dikenal sebagai pemecah masalah terbaik dan dinilai selalu memiliki pikiran logis dalam melakukan pekerjaan.
   
    Tugas dalam backend meliputi :

   * mengelola database,
   * bekerja dengan sistem operasi, contoh: UNIX,
   * pengatur keamanan dan mencegah peretasan, dll.
    
    <br>
    berbicara tentang peretasan, pembelajaran hari ini juga menjelaskan tentang peretasan bernama SQL Injection, jadi menurut pemahaman saya dan research mandiri, SQL injection adalah teknik penempatan code berbahaya dalam statement SQL. contoh: jika ada fitur login dimana user yang berperan sebagai ADMIN memasukan username dan password, pada umumnya 2 hal ini diinputkan dengan nama username admin dan password admin, dan menghasil query seperti berikut :<br>

    ```sql
    Select * From Admin Where username =”randy” AND password =”anugerah”;
    ```
    jika statement where itu true maka admin randy akan mendapatkan datanya.

    Bagaimana jika hacker memasukkan username dan password seperti ini (“ or “” = “), maka hasil query akan seperti berikut :<br>

    ```sql
    Select * From Admin Where username =”“ or “” = “” AND password =”“ or “” = “”;
    ```
    hal ini juga akan menghasilkan kondisi true, maka akan sangat berbahaya karena hacker bisa masuk sebagai user yang terdapat pada record pertama dalam table Admin (record pertama biasanya admin) dan mendapatkan akses dengan role admin.<br>

2. Java <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" height="20px"/>

    Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems, yang saat ini merupakan bagian dari Oracle dan dirilis tahun 1995. kelebihan Java :
    * Java bekerja di platform yang berbeda (Windows, Mac, Linux, Raspberry Pi, etc.)
    * salah satu programming language yang paling populer di dunia
    * mudah dipelajari dan simple untuk digunakan
    * Java dihadirkan secara open source dan gratis
    * memiliki banyak komunitas yang besar.<br />

    JDK & JRE
    * JDK (Java Development Kit) - Digunakan untuk pembuatan suatu program dengan bahasa Java.
    * JRE (Java Runtime Environtment) - Digunakan untuk menjalankan suatu program dalam bahasa Java.<br />

3. Kotlin <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/kotlin/kotlin-original.svg" height="15px"/> 

    Kotlin merupakan bahasa cantik dari Java. Kotlin adalah bahasa pemrograman modern yang sedang tren dirilis pada tahun 2016 oleh JetBrains.
    Kotlin menjadi sangat populer karena kompatibel dengan Java, yang berarti bahwa kode Java (dan perpustakaan) dapat digunakan dalam program Kotlin.
    kelebihan Kotlin :
    * Kotlin bekerja di platform yang berbeda (Windows,  Mac, Linux, Raspberry Pi, etc.)
    * Kotlin kompatibel dengan Java
    * mudah dipelajari, terutama ketika sudah mengenal Java
    * Kotlin gratis untuk digunakan
    * memiliki banyak komunitas yang besar
    * Kotlin ringkas dan dilahirkan dengan keamanan yang  baik
    
    Contoh kotlin itu ringkas :
    ```kotlin
    data class Employee(
       val name: String,
       val email: String,
       val company: String
    ) // + automatically generated equals(), hashCode(), toString(), and copy()

    object MyCompany {                                // A singleton
       const val name: String = "MyCompany"
    }

    fun main() {                                      // Function at the top level
       val employee = Employee("Alice",               // No `new` keyword
          "alice@mycompany.com", MyCompany.name)
       println(employee)
    }
    ```
    
    Contoh kotlin itu aman :
    
    ```kotlin
    fun reply(condition: Boolean): String? =          // Nullability is part of Kotlin’s type system
       if (condition) "I'm fine" else null

    fun error(): Nothing =                            // Always throw an exception
       throw IllegalStateException("Shouldn't be here")

    fun main() {
       val condition = true                        // Try replacing `true` with `false` and run the sample!
       val message = reply(condition)              // The result is nullable
       // println(message.uppercase())             // This line doesn't compile
       println(message?.replace("fine", "okay"))   // Access a nullable value in a safe manner
       if (message != null) {                      // If you check that the type is right,
          println(message.uppercase())             // the compiler will smart-cast it for you
       }

       val nonNull: String =                             // If the null-case throws an error,
       reply(condition = true) ?: error()             // Kotlin can infer that the result is non-null
       println(nonNull)
    }
    ```

4. IDE :
   
   * Eclipse <img src="https://cdn.worldvectorlogo.com/logos/eclipse-11.svg" height="20px"/>
   * Netbeans <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Apache_NetBeans_Logo.svg/444px-Apache_NetBeans_Logo.svg.png?20180920122700" height="20px"/>
   * IntelliJ <img src="https://cdn.worldvectorlogo.com/logos/intellij-idea-1.svg" height="20px"/><br />
     
   IDE (Integrated Development Environment) dimana pengguna dapat melakukan debugging, refactoring, compiling, pembuatan packages dan lain-lain. 
   Membahas tentang JetBrains Toolbox juga, untuk update versi IDE lebih enak.<br />

5. Database : 
   
   * MySql <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original.svg" height="20px"/>

   * PostgreSQL <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original.svg" height="20px"/>
       
   * Redis <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/redis/redis-original.svg" height="20px"/>

   * ElasticSearch <img src="https://cdn.worldvectorlogo.com/logos/elasticsearch.svg" height="20px"/>
       
    MySql digunakan sebagai database Utama. Redis digunakan untuk memberikan kenyamanan pengalaman seorang user ketika mengakses sebuah aplikasi berbasis web untuk mempercepat refresh suatu browser hingga <= 1 detik, dibandingkan database yang lain yang kemungkinan bisa >= 3 detik.ElasticSearch digunakan untuk pencarian yang lebih cepat, karena ketika menggunakan query pada database itu mahal <br />

6. RabbitMq <img src="https://cdn.worldvectorlogo.com/logos/rabbitmq.svg" height="20px"/>

   RabbitMq merupakan message queueing yang berguna untuk menghandle banyak pesan yang masuk dalam satu waktu dengan menerapkan antrian pada pesan itu, biasa disebut kantor pos.
   mirip kafka.<br />

7. CI/CD
   
   Continuous integration (CI) adalah pengintegrasian kode ke dalam repositori kode kemudian menjalankan pengujian secara otomatis, cepat, dan sering. Kamu dapat melakukan CI ini dengan menggunakan perintah  commit.

   Sementara continous delivery atau continuous deployment (CD) adalah praktik yang dilakukan setelah proses CI selesai dan seluruh kode berhasil terintegrasi, sehingga aplikasi bisa dibangun lalu dirilis secara otomatis.

   Kelebihan CI/CD:
   * Mendapat feedback lebih cepat
   * Dapat mendeteksi bug lebih cepat
   * Dapat mempercepat proses rilis
   * Memangkas waktu karena dilakukan secara otomatis

   Tools CI/CD:
   * Jenkins <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/jenkins/jenkins-original.svg" height="20px"/>
   * Gitlab CI/CD <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/gitlab/gitlab-original.svg" height="20px"/>

8. Version Control
   
   Version control adalah sebuah sistem yang merekam perubahan-perubahan dari sebuah berkas atau sekumpulan berkas dari waktu ke waktu sehingga Anda dapat menilik kembali versi khusus suatu saat nanti. 

   Tools Version Control:
   * Git <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/git/git-original.svg" height="20px"/>
   * Subversion <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/subversion/subversion-original.svg" height="20px"/></br>

9. Code Quality Analysis
   
   Code Quality Analysis berguna untuk check sebuah code yang ditulis oleh programmer sudah berkualitas tinggi atau masih kualitas rendah. Kualitas kode itu penting, karena berdampak pada kualitas perangkat lunak secara keseluruhan. Dan kualitas memengaruhi seberapa aman basis kode yang ditulis programmer.

   Tools Code Quality Analysis:
   * SonarCloud <img src="https://cdn.worldvectorlogo.com/logos/sonarcloud-1.svg" height="20px"/><br><br>
 
   
   
<p align="left">Sources :
    
* https://kotlinlang.org/
* https://icons8.com/icons
* https://github.com/devicons/devicon
* https://commons.wikimedia.org/wiki/Main_Page
* https://www.dicoding.com/blog/apa-itu-ci-cd/
* https://git-scm.com/book/id/v2/Memulai-Tentang-Version-Control
* https://worldvectorlogo.com/
</p>

