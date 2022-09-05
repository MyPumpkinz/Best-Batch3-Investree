note :

```scanner.nextInt()!!``` wajib menggunakan var tsb (jgn suka dipake)

```nextLine``` lebih enak digunakan jika tidak ada operasi MTK, biar ```else ```juga enak: bisa kalimat

```ctrl + alt + L``` = reformat code

```SpotifyMenu.LOGIN.id ``` penggunaan enum dari package enums -> SpotifyMenu

```enum class SpotifyMenu(val id: String, val desc: String)``` = ```id``` dan ```desc``` ini merupakan properties dari enum

biasain menggunakan huruf besar ketika membuat File dan Kelas

lazy-initialization = ```lateinit var credentialFeature: CredentialFeature``` (lateinit), gak bisa VAL

kalo membuat data dalam data class biasakan bernilai ```null```

findAllUSer (semua/lebih dari 1) bisa menggunakan ```List ```

findUser (hanya mendapatkan 1 user) tidak perlu menggunakan ```List```

```equals(findUsername, true)``` true pada parameter kedua digunakan untuk mengignore huruf besar (yang penting pelafalan nya sama)

find() sudah mengandung ```return null```

```listof``` tidak bisa menggunakan add() , bisa diganti ```mutablelistof```

IDE lebih enak karena bisa auto generate yang dibutuhkan pengembang, kalo di editor perlu plugin