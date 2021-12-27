package com.junarcho.fruitpedia.entity

import com.junarcho.buahpedia.R

object FruitsData {

    private val fruitNames = arrayOf(
        "Alpukat",
        "Anggur",
        "Apel",
        "Belimbing",
        "Blueberry",
        "Buah Naga",
        "Ceri",
        "Duku",
        "Durian",
        "Jambu Biji",
        "Jeruk",
        "Pisang",
        "Rambutan",
        "Stroberi"
    )

    private val englishName = arrayOf(
        "Avocado",
        "Grape",
        "Apple",
        "Star Fruit",
        "Blueberry",
        "Dragon Fruit",
        "Cherry",
        "Duku",
        "Durian",
        "Guava",
        "Orange",
        "Banana",
        "Rambutan",
        "Strawberry"
    )

    private val fruitDetails = arrayOf(

        "Alpukat bertipe buni, memiliki kulit lembut tak rata berwarna hijau tua hingga ungu kecoklatan, " +
                "tergantung pada varietasnya. \n" +
                "Daging buah alpokat berwarna hijau muda dekat kulit dan kuning muda dekat biji " +
                "dengan tekstur lembut.\n" +
                "Dengan mempunyai kandungan nutrisi yang banyak dan tekstur dagingnya yang tebal, " +
                "membuat alpukat menjadi buah-buahan yang nikmat untuk dikonsumsi dan memiliki banyak penggemar.",

        "Anggur biasanya digunakan untuk membuat jus anggur, jelly, minuman anggur, " +
                "minyak biji anggur dan kismis, atau dimakan langsung.\n" +
                "Buah ini juga dikenal karena mengandung banyak senyawa polifenol dan resveratol yang " +
                "berperan aktif dalam berbagai metabolisme tubuh serta mampu mencegah terbentuknya sel kanker dan berbagai penyakit lainnya.",

        "Apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), " +
                "namun bisa juga kulitnya berwarna hijau atau kuning.\n" +
                "Kandungan yang terdapat pada buah ini kaya akan nutrisi, vitamin, dan mineral yang baik untuk menjaga tubuh kesehatan tubuh. " +
                "Seseorang yang gemar mengonsumsi makanan ini terbukti lebih sehat dan stamina tubuh terjaga.",

        "Belimbing adalah buah yang populer di iklim tropis, " +
                "buah ini dikenal dengan rasa asam-manisnya yang menyegarkan dan bentuknya yang khas.\n" +
                "Buah belimbing kaya akan serat dan vitamin C. Dalam satu buah belimbing berukuran sedang (90 gram), " +
                "setidaknya terkandung 3 gram serat, 1 gram protein, serta dapat memenuhi 52% kebutuhan harian tubuh akan vitamin C.",

        "Blueberry adalah buah berbentuk bola kecil nan kaya manfaat. Buah ini dikenal sebagai buah dengan antioksidan yang tinggi. " +
                "Di samping itu, blueberry memiliki khasiat lain yang akan mendorong orang untuk lebih rajin mengonsumsinya.",

        "Buah Naga memiliki kulit yang tampak bersisik dan berwarna merah keunguan atau merah muda. " +
                "Berdasarkan warna dagingnya, buah naga terdiri atas 2 jenis, yaitu buah naga putih dan buah naga merah.\n" +
                "Buah naga termasuk jenis buah yang rendah kalori. " +
                "Dalam seporsi buah naga (sekitar 100 gram) hanya terdapat sekitar 60 kalori dan juga sama sekali tidak mengandung lemak.",

        "Buah cherry (ceri) merupakan bagian dari famili Rosaceae yang juga mencakup buah persik, plum, dan nektarin. " +
                "Buah mungil berwarna merah menggoda ini sudah dinikmati sebagai salah satu sajian sehat sejak zaman bangsa Romawi kuno dulu\n" +
                "Buah ceri digolongkan menjadi 2 jenis, yaitu ceri manis dan ceri asam. " +
                "Ceri asam mengandung kalori yang lebih rendah daripada ceri manis, " +
                "namun mengandung vitamin C dan beta karoten yang lebih tinggi.",

        "Buah duku merupakan tanaman buah tropis bertipe iklim basah yang berasal dari Malaysia dan Indonesia." +
                "Di luar Jawa, duku serinng disebut langsat. Namun di daerah Jawa, buah langsat sering disebut buah kokosan.\n" +
                "Duku memiliki banyak varietas, ada yang buahnya besar sekali, tetapi ada pula yang kecil. " +
                "Ada yang berbiji besar, ada pula yang tidak berbiji (partenokarpi), tetapi adapula yang apomiksis (biji vegetatif).",

        "Durian adalah tumbuhan tropis yang berasal dari wilayah Asia Tenggara, nama ini diambil dari ciri khas kulit " +
                "buahnya yang keras dan berlekuk-lekuk tajam sehingga menyerupai duri. " +
                "Sebutan populernya adalah raja dari segala buah (King of Fruit).\n" +
                "Durian adalah buah yang kontroversial, meskipun banyak orang yang menyukainya, " +
                "tetapi sebagian yang lain malah muak dengan aromanya.",

        "Jambu biji adalah tanaman tropis yang berasal dari Brasil, disebarkan ke Indonesia melalui Thailand." +
                "Jambu biji memiliki buah yang berwarna hijau dengan daging buah berwarna putih atau merah dan berasa asam-manis.\n" +
                "Tak hanya dalam kondisi matang, buah jambu biji bahkan kerap disantap dalam " +
                "kondisi mentah atau setengah matang untuk rujakan.",

        "Buah jeruk mungkin salah satu yang terkenal di dunia, dan setiap orang " +
                "pasti memiliki wawasan mengenai kandungan vitamin C yang tinggi di dalamnya.\n" +
                "Buah dengan warna oranye cantik dan manis ini telah dikenal luas mengandung " +
                "nutrisi penting bagi kesehatan tubuh. Tak hanya soal khasiatnya, buah ini " +
                "seringkali dijadikan racikan minuman menyegarkan pelepas dahaga.",

        "Pisang merupakan buah yang tumbuh subur di negara tropis. Pisang merupakan komoditas hortikultura keempat yang " +
                "terpenting setelah beras, susu, dan gandum. Dalam pisang terkandung Karbohidrat, Kalsium, Vitamin C, dan Betakarotein.\n" +
                "Indonesia merupakan salah satu pusat keragaman buah pisang, baik untuk konsumsi maupun sebagai bahan olahan seperti" +
                "pisang goreng.",

        "Buah rambutan mengandung arti buah yang berbulu. Nama tersebut sesuai dengan bentuk kulit buahnya yang " +
                "ditumbuhi duri halus menyerupai bulu\n." +
                "Buah rambutan berbentuk bulat warnanya mulai dari hijau, kuning hingga merah. " +
                "Daging buah berwarna putih cenderung bening. Buah yang telah matang rasanya manis hingga asam manis. " +
                "Bagian yang bisa dimakan hanya daging buah, sedangkan kulit dan bijinya tidak bisa dimakan.",

        "Stroberi merupakan buah yang berasal dari daerah subtropis dimana pertama kali ditemukan di daerah Chili, Amerika Serikat. " +
                "Memiliki warna, rasa dan aroma yang begitu kuat ketika dirasakan. Karena habitat aslinya di daerah subtropis, " +
                "maka hanya ada beberapa wilayah di Indonesia yang dapat ditanami tanaman ini.\n" +
                "Rasa buah strawberry adalah antara asam dan manis, terkadang rasa asamnya jauh lebih menyengat ketimbang rasa manisnya"
    )

    private val fruitsImages = intArrayOf(
        R.drawable.alpukat,
        R.drawable.anggur,
        R.drawable.apel,
        R.drawable.belimbing,
        R.drawable.blueberry,
        R.drawable.buah_naga,
        R.drawable.ceri,
        R.drawable.duku,
        R.drawable.durian,
        R.drawable.jambu,
        R.drawable.jeruk,
        R.drawable.pisang,
        R.drawable.rambutan,
        R.drawable.stroberi
    )

    private val fruitBenefit = arrayOf(

        //Alpukat
        "Meningkatkan rasa kenyang\n" +
                "Menurunkan berat badan\n" +
                "Menjaga kesehatan jantung\n" +
                "Menjaga kesehatan rambut\n" +
                "Mencegah penyakit kanker\n" +
                "Menurunkan kolesterol\n" +
                "Menyehatkan kulit\n" +
                "Mengurangi risiko stroke\n" +
                "Menjaga gula darah\n" +
                "Mencegah diabetes",

        //Anggur
        "Mencegah penyakit kanker\n" +
                "Menjaga kesehatan jantung\n" +
                "Menurunkan tekanan darah tinggi\n" +
                "Mencegah daibetes\n" +
                "Menjaga kesehatan kulit\n" +
                "Mencegah penyakit usus\n" +
                "Mengobati asma\n" +
                "Mencegah penuaan dini\n" +
                "Menurunkan berat badan\n" +
                "Mencerdaskan otak",

        //Apel
        "Melindungi sel-sel otak dari demensia pada hari tua\n" +
                "Menstabilkan gula darah\n" +
                "Menurunkan resiko stroke\n" +
                "Mengatasi anemia\n" +
                "Menurunkan berat badan\n" +
                "Melancarkan pencernaan\n" +
                "Menguatkan tulang dan gigi\n" +
                "Meningkatkan kemampuan memori otak\n" +
                "Melawan radikal bebas\n" +
                "Menjaga kesehatan usus",

        //Belimbing
        "Menurunkan berat badan\n" +
                "Mengendalikan kadar gula darah\n" +
                "Memperkuat sistem imunitas\n" +
                "Meredakan sakit maag\n" +
                "Mengurangi resiko penyakit stroke\n" +
                "Mencegah kanker\n" +
                "Meningkatkan kekebalan tubuh\n" +
                "Menyembuhkan masalah kulit\n" +
                "Mengobati sariawan\n" +
                "Mengurangi kadar kolesterol",

        //Blueberry
        "Menigkatkan daya tahan tubuh\n" +
                "Stimulasi otak\n" +
                "Baik untuk kulit kering\n" +
                "Membantu menajamkan penglihatan\n" +
                "Mencegah penyakit kanker\n" +
                "Mencegah resiko terkena tulang keropos\n" +
                "Menjaga kesehatan jantung\n" +
                "Menurunkan gula darah\n" +
                "Mengurangi lemak badan\n" +
                "Baik untuk pertumbuhan tulang bayi",

        //Buah_Naga
        "Melindungi tubuh dari radikal bebas\n" +
                "Menjaga kelancaran metabolisme tubuh\n" +
                "Mencegah dan meringankan kram otot\n" +
                "Menjaga kesehatan jantung\n" +
                "Memelihara kekuatan tulang\n" +
                "Mencegah penyakit kanker\n" +
                "Meningkatkan nafsu makan\n" +
                "Melancarkan peredaran darah\n" +
                "Mengatasi anemia\n" +
                "Mencegah diabetes",

        //Ceri
        "Melindungi tubuh dari peradangan\n" +
                "Melindungi tubuh dari radikal bebas\n" +
                "Menurunkan berat badan\n" +
                "Menjaga kesehatan jantung\n" +
                "Menurunkan resiko asam urat\n" +
                "Mengurangi kadar kolesterol\n" +
                "Mencegah penyakit kanker\n" +
                "Meningkatkan kualitas tidur\n" +
                "Membantu menajamkan penglihatan\n" +
                "Meningkatkan sistem kekebalan tubuh",

        //Duku
        "Meningkatkan sistem imun\n" +
                "Melancarkan sistem pencernaan\n" +
                "Sumber antioksidan\n" +
                "Menjaga kesehatan gigi dan gusi\n" +
                "Mengurangi kadar kolesterol\n" +
                "Mengobati diare\n" +
                "Menjaga kesehatan kulit\n" +
                "Mencegah penuaan dini\n" +
                "Mengurangi kadar kolesterol\n" +
                "Menurunkan berat badan",

        //Durian
        "Menjaga kesehatan tulang\n" +
                "Membantu meringankan depresi\n" +
                "Meningkatkan kualitas tidur\n" +
                "Melancarakan sistem pencernaan\n" +
                "Mengatasi anemia\n" +
                "Menjaga kesehatan jantung\n" +
                "Meningkatkan sistem imun\n" +
                "Mencegah penuaan dini\n" +
                "Memelihara kekuatan tulang\n" +
                "Mempertahankan tingkat tekanan darah",

        //Jambu
        "Mengobati demam berdarah\n" +
                "Mempertahankan tingkat tekanan darah\n" +
                "Mengobati sariawan\n" +
                "Melancarakan sistem pencernaan\n" +
                "Mengurangi kadar kolesterol\n" +
                "Mengatasi anemia\n" +
                "Menjaga kesehatan mata\n" +
                "Mengobati diare\n" +
                "Menjaga gula darah\n" +
                "Menjaga kesehatan jantung",

        //Jeruk
        "Menigkatkan daya tahan tubuh\n" +
                "Mencegah penyakit kanker\n" +
                "Menjaga tekanan darah tetap normal\n" +
                "Mengurangi kadar kolesterol\n" +
                "Melancarakan sistem pencernaan\n" +
                "Mengurangi stres dan depresi" +
                "Memelihara kekuatan tulang\n" +
                "Menurunkan berat badan\n" +
                "Menjaga gula darah\n" +
                "Memperbaiki suasana hati",

        //Pisang
        "Sebagai sumber energi\n" +
                "Melancarakan sistem pencernaan\n" +
                "Meredakan sakit maag\n" +
                "Mengobati diare\n" +
                "Mengatasi anemia\n" +
                "Memperbaiki suasana hati\n" +
                "Menjaga kesehatan kulit\n" +
                "Mengobati jerawat\n" +
                "Menjaga kesehatan jantung\n" +
                "Menjaga kesehatan tulang",

        //Rambutan
        "Menjaga kesehatan jantung\n" +
                "Mencegah penyakit ginjal\n" +
                "Menjaga kesehatan tulang\n" +
                "Mengatasi hipertensi/darah tinggi\n" +
                "Meningkatkan metabolisme tubuh\n" +
                "Menjaga kesehatan jantung\n" +
                "Menurunkan berat badan\n" +
                "Menjaga kesehatan kulit\n" +
                "Mencegah penyakit kanker\n" +
                "Mengobati sembelit",

        //Stroberi
        "Menjaga kesehatan jantung\n" +
                "Mencegah penuaan dini\n" +
                "Memperkuat daya tahan tubuh\n" +
                "Mengurangi peradangan dalam tubuh\n" +
                "Menjaga ksehatan mata\n" +
                "Mencegah penyakit kanker\n" +
                "Mengobati nyeri sendi dan asam urat\n" +
                "Mencegah penyakit kanker\n" +
                "Mengatasi hipertensi/darah tinggi\n" +
                "Mengendalikan kadar gula darah"
    )

    val listData: ArrayList<Fruits>
        get() {
            val list = arrayListOf<Fruits>()
            for (position in fruitNames.indices) {
                val fruits = Fruits()
                fruits.name = fruitNames[position]
                fruits.englishName = englishName[position]
                fruits.details = fruitDetails[position]
                fruits.photo = fruitsImages[position]
                fruits.benefits = fruitBenefit[position]
                list.add(fruits)

            }

            return list
        }
}