package com.example.week8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week8.adaptor.adaptor
import com.example.week8.model.crazy
import com.example.week8.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = ArrayList<crazy>()
        data.add(crazy(R.drawable.jeff,"Jeff Bezos","CEO sekaligus pendiri Amazon, e-commerce terbesar di dunia, adalah orang terkaya di dunia nomor satu versi majalah Forbes.Jeff Bezos memiliki total kekayaan bersih sebesar 182 miliar dolar AS atau setara Rp 2,677 triliun."))
        data.add(crazy(R.drawable.billgates,"Bill Gates","Pengusaha perangkat lunak Microsoft ini menjadi orang terkaya kedua di dunia versi majalah Forbes. Hingga Oktober 2020, Bill Gates memiliki total kekayaan mencapai 126 miliar AS atau sekitar Rp 1.857 triliun"))
        data.add(crazy(R.drawable.arnold,"Bernard Arnault","Pemilik fashion nomor satu dunia LVMH, Bernard Arnault, melonjak 8 miliar dolar AS atau setara Rp 117,6 triliun pada akhir Oktober 2020 setelah penjualan barang-barang mewah mulai menanjak pasca tertekan pandemi beberapa bulan terakhir"))
        data.add(crazy(R.drawable.warren,"Warren Buffet","Menurut data yang tercatat oleh Forbes, CEO raksasa bisnis Bershire Hathaway ini memiliki kekayaan mencapai 86 miliar dolar AS atau sekitar Rp 1,25 triliun.Karena kepiawaiannya, kini ia tinggal memetik hasilnya. Data terakhir, per harinya Warren Buffet mendapat pemasukan sekitar 40 juta dolar AS atau sekitar Rp 565 miliar.."))
        data.add(crazy(R.drawable.larry,"Larry Ellison","Pria kelahiran New York, 17 Agustus 1944 ini, adalah orang terkaya kelima di dunia 2020 versi majalah Forbes. Kekayaan Larry Ellison mencapai 75,3 miliar dolar AS atau sekitar Rp 1.063 triliun.."))
        data.add(crazy(R.drawable.amancio,"Amancio Ortega","Dengan menjalankan bisnis Zara di industri fashion dan ritel, Ortega mampu menghimpun kekayaan bersih senilai US\$55,1 miliar (sekitar Rp893,9 T).."))
        data.add(crazy(R.drawable.mark,"Mark Zuckerbeg","Pendiri Facebook ini memiliki kekayaan berjumlah US\$54,7 miliar (sekitar Rp887,3 T) yang tentunya berasal dari grup raksasa media sosial: Facebook, WhatsApp, dan Instagram.."))
        data.add(crazy(R.drawable.alice,"Alice Walton","Alice Walton adalah wanita terkaya di Amerika Serikat (AS), menurut daftar Forbes tahun 2020 dari 400 orang terkaya di Paman Sam.Sama seperti Jim Walton, Alice Walton menghimpun kekayaan dari Walmart. Namun, kekayaannya sedikit lebih kecil dibanding Jim Walton, ia hanya memiliki US\$54,4 miliar (sekitar Rp882,6 T)."))
        data.add(crazy(R.drawable.rob,"Rob Walton","Pemilik nama asli Samuel Robson Walton ini lahir pada 29 Maret 1949. Dia memegang posisi Ketua Dewan Direksi Wal-Mart dari 1992 hingga 2015. Saat ini, kegiatan utamanya terkait dengan organisasi pendidikan dan nirlaba.Di bawah Jim Walton dan Alice Walton, Rob Walton telah mengumpulkan harta setara dengan US\$54,1 miliar (sekitar Rp877,7 T)."))
        data.add(crazy(R.drawable.steve,"Steve Ballmer"," Ballmer merupakan mantan CEO Microsoft tahun 2000-2014. Pemilik nama asli Steven Anthony Ballmer lahir pada 24 Maret 1957 di Detroit, Michigan.Rekan Bill Gates di Microsoft ini mempunyai kekayaan bersih dengan total US\$52,7 miliar (sekitar Rp855 T)."))

        var adaptor = adaptor(data)
        binding.rcy.adapter = adaptor
        binding.rcy.layoutManager = LinearLayoutManager(this)
    }
}