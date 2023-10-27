package com.example.a26

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(absolutes: IntArray, signs: BooleanArray): Int {
                var answer: Int = 123456789
                var res : IntArray = absolutes
                for(index in 0..res.size-1){
                    if(signs.get(index).equals(false)) res[index]=-1*absolutes[index]
                }
                //합산하기
                answer = res.sum()
                return answer
            }
        }
        val a =Solution()
        a.solution(intArrayOf(4,7,12), booleanArrayOf(true,false,true))
        a.solution(intArrayOf(1,2,3), booleanArrayOf(false,false,true))
    }
}