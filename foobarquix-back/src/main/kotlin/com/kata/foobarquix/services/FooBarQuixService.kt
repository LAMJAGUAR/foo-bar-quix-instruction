package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        var convertedNumber: String = "";
        if (inputNumber % 3 === 0) {
            convertedNumber = "Foo";
        }
        if (inputNumber % 5 === 0) {
            convertedNumber += "Bar";
        }

        val numberToString: String = inputNumber.toString();
        for (singleCharacter in numberToString) {
            if (singleCharacter == '3') {
                convertedNumber += "Foo";
                continue;
            }
            if (singleCharacter == '5') {
                convertedNumber += "Bar";
                continue;
            }
            if (singleCharacter == '7') {
                convertedNumber += "Quix";
            }
        }
        return if (convertedNumber.isEmpty()) numberToString else convertedNumber;
    }

}