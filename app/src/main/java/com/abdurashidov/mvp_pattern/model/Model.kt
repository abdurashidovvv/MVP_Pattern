package com.abdurashidov.mvp_pattern.modelimport android.os.Handlerimport android.os.Looperimport com.abdurashidov.mvp_pattern.presenter.Contractimport java.util.Randomclass Model:Contract.Model {    private val arrayList= listOf(        "Android uchun Kotlinda dasturlarni ishlab chiqish ishlab chiquvchilar orasida ommalashib bormoqda. Biz Android ishlab chiqarish dunyosidagi barcha trendli kutubxonalardan (RxJava tashqari) foydalanib to'liq dastur yozamiz. Oxir-oqibat, biz kengaytiriladigan va osonlikcha sinab ko'riladigan dasturga ega bo'lishimiz kerak .",        "Swift (tez, ildam) - 2014 yil Apple tomonidan ommaga taqdim etildi. Apple tizimlarida shu davrga qadar Objective C dasturlash tili native va yakka til edi. Swift yaratilgach u ham native til hisobiga kiritildi. Swift Apple dasturchi muhandislari tomonidan yaratilgan. Uning yaratilishi Apple qurilmalariga dastur yaratilishini juda keng ma'noda o'zgarish yaratdi",        "Front End – bu turli xil web-saytlar, web-ilovalarning bizga ko’rinib turgan qismi hisoblanadi. Siz ko’rgan barcha saytlardagi turli xil animatsiyalar, tugmalar, matnlar, rasmlar va boshqa barcha bizga ko’rinib turgan qismi Front Endga kiradi.",        "Back End Development - orqa tomonni rivojlantirish, dasturning server tomoniga va ma'lumotlar bazasi va brauzer o'rtasida aloqador narsalarga tegishlidir. Back End Development/Orqa tomon ishlab chiqishi deganda, avvalo saytning ishlashiga e'tiborinni qaratadigan rivojlanishning server tomoni tushuniladi."    )    override fun getNextCourse(onFinishedListener: Contract.Model.onFinishedListener?) {        Handler(Looper.getMainLooper()).postDelayed({            onFinishedListener!!.onFinished(                getRandomString            )        },            1000)    }    private val getRandomString:String    get() {        val random= Random()        val index= random.nextInt(arrayList.size)        return arrayList[index]    }}