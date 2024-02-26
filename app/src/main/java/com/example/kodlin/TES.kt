
fun main(args: Array<String>) {
    biodata("amrizal")
    hobby("baca","baca apa aja pokoknya...")
}

fun biodata(nama: String, kelas:String = "2A"){ // minimal 2 parameter/args
    val biodata = """
        nama = $nama
        kelas = $kelas 
    """
    print(biodata)
}

fun hobby(nama:String, desc:String){ // 2 parameter
    println("hobby = $nama")
    println(desc)

}