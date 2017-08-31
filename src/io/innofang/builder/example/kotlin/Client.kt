package io.innofang.builder.example.kotlin

/**
 * Created by Inno Fang on 2017/8/31.
 */

fun main(args: Array<String>) {
    val ferrari = Ferrari.build {
        brand = "ferrari"
        color = "red"
        licensePlate = "B88888"
    }

    println(ferrari)
}