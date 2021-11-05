package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.gantar,"Kebudayaan Tarian Kalimantan Timur","Tari Gantar Rayatn","Kegiatan Tari Gantar Rayatn merupakan tarian dari daerah Kalimantan Timur. Keunikan dari tari ini ada terdapat pada jenis tarinya yang memakai satu alat yaitu Gantar (kayu yang panjang), pada ujung tongkat tersebut diikatkan/digantung tengkorak manusia yang dibungkus dengan kain merah dan dihiasi dengan Ibus. Mereka menari berkeliling sambil menyanyi, dipinggang penari terikat Mandau. Apabila tidak memegang tongkat, mereka mengelewai (melambaikan tangan sesuai irama)."))

        data?.add(DataModel(R.drawable.serumpai,"Kebudayaan Tarian Kalimantan Timur","Tarian Serumpai", "Tari Serumpai adalah tarian adat suku Dayak Benuay di Kabupaten Kutai, Kalimantan Timur. Tari serumpai hampir sama dengan tari Monong atau tari Manang karena tari Serumpai di fungsikan dan digunakan untuk pengobatan yang berhubungan dengan penyakit. Bedanya tarian serumpai ini untuk menolak wabah penyakit dan mengobati orang yang digigit oleh anjing gila."))

        data?.add(DataModel(R.drawable.kancet,"Kebudayaan Tarian Kalimantan Timur","Tari Kancet Ledo (Tari Gong)", "Nama lain dari Tari Kancet Ledo adalah Tari Gong disebut masyarakat Kalimantan Timur. Tari Kancet Ledo merupakan salah satu ekspresi seni tari yang mengekspresikan tentang kelembutan seorang wanita dengan menari di atas Gong dengan gerakan yang lemah lembut dan penuh keseimbangan."))

        data?.add(DataModel(R.drawable.gantarbusai,"Kebudayaan Tarian Kalimantan Timur","Tari Gantar Busai", "Budaya Tari Gantar Busai merupakan tarian yang berasal dari Kalimantan Timur. Jenis tari ini hanya membawa sepotong bambu yang diisi dengan biji-bijian yang dipegang tangan sebelah kanan. Sedangkan tangan kiri tidak membawa apa-apa. Ketika menari dilambai-lambaikan sesuai irama, sedangkan bambunya berukuran 50 cm diberi dua belas gelang agar berbunyi gemerincing jika digerakkan. Jumlah bambu atau gantar tersebut sesuai dengan jumlah penarinya. Mereka menari berkelompok-kelompok, kadang ada yang “Ngloak” (menari sambil saling memupuki dengan pupur basah)."))

        data?.add(DataModel(R.drawable.punanleto,"Kebudayaan Tarian Kalimantan Timur","Tari Kancet Punan Letto", "Seni Tari Punan Letto adalah tari tradisional dari daerah Kalimantan Timur. Kata “Punan” artinya merebut, sedang katan “letto” artinya gadis/wanita.\n" +
                "Cerita yang dibangun dalam tarian ini yaitu tentang dua orang pemuda yang sama-sama menyukai seorang gadis dan memperebutkannya. Pemuda yang mempertahankan gadisnya dengan gagah berani akhirnya memenangkan pertarungan tersebut. Sudah merupakan sifat suku Dayak Kenyah, selalu berkorban guna mempertahankan miliknya apa pun itu bentuknya.\n"))

        data?.add(DataModel(R.drawable.hudoq,"Kebudayaan Tarian Kalimantan Timur","Tari Hudoq", "Bisa dibilang bahwa Tari Hudoq merupakan tarian tradisional dari Kalimantan Timur. Tarian ini disebut sebagai tarian topeng bagi suku (etnis Bahau) yang di percaya sebagai tarian kedatangan para dewa utusan Sang Pencipta ke dalam dunia. Kedatangan Dewa menurut mereka untuk menjaga dan melindungi kehidupan dan tanaman padi yang baru di tanam. Hal ini dilakukan oleh mereka karena khawatir manusia bisa ketularan atau sakit serta mati, bila melihat langsung wajah para dewa. Maka dari itu NALING LEDAANG yang dianggap sebagai pemimpin para dewa oleh mereka, mengajak teman – temannya membuat topeng dari pohon kayu Jelutung (Jabon -Kitaaq), dan kemudian membuat pakaian dari daun pisang “uraan” guna menutupi seluruh tubuh mereka."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }

    private fun DataModel(gambar: Int, lokasi: String, nama: String) {

    }
}