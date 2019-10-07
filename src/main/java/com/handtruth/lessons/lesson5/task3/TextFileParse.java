package com.handtruth.lessons.lesson5.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Задачи урока можно решить несолькими способами, но
 * перед выполнением рекомендуется почитать про регулярные выражения,
 * а так же ознакомиться с библиотечными методами обработки строк в Java
 * (на самом деле велосипеды это плохо, самописный split будет оценен соответствующе :Р)
 */
class TextFileParse {

    /**
     * Normal
     *
     * Дано имя текстового файла, вернуть список с количеством слов на каждой строке
     * Словом считается любая последовательность символов, отделенная пробелами
     * Пример:
     *  asdasdasdasd asdasd o, hi mark!
     *  lorem ipsum
     *  h4h4, n0b0dy r34ds t3st f1l3s
     *  _1, ***, (T_T). !(°□°)!
     *
     *  Результат функции - {5, 2, 5, 4}
     */

    List<Integer> countWords(String filename){
        // TODO your code
        return new ArrayList<>();
    }



    /**
     * Normal
     * <p>
     * Проверить входную строку на соответствие формату номера мобильного телефона
     * Вид формата <код страны> (<три числа>) <три числа>-<два числа>-<два числа>
     * В начале строки может быть один "+"
     */
    Boolean parsePhoneNumber(String input) {
        // TODO your code
        return false;
    }




    /**
     * Hard
     * <p>
     * Дано имя текстового файла, известно, что текст состоит из слов, слова разделены пробелами
     * Вернуть список адресов всех электронных почт в порядке их появления в файле
     * Почтой считается слово, соответствующее шаблону <nickname>@<servicename>.<domenname>
     * В domenname и servicename могут находиться только буквы и цифры
     * В nickname, буквы, цифры и _
     */
    List<String> parseMails(String filename) {
        return new ArrayList<>();
    }


    /**
     * Normal
     *
     * Дано имя текстового файла, необходимо переписать его содержимое в другой файл
     * Полученный файл должен быть идентичен изначальному
     * Имя нового файла так же задано в параметрах
     */

    void rewriteFile(String inputName, String outName){
        // TODO your code
    }

}
