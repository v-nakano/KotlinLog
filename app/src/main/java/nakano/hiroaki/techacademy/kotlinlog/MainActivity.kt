package nakano.hiroaki.techacademy.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("田中", 20,"野球")     // 名前を、年齢歳で、のインスタンスを作る
        human1.say()
        human1.think()

        val human2 = Human("佐藤", 50,"サッカー")     // 名前を、年齢歳で、のインスタンスを作る
        human2.say()
        human2.think()
    }
}
