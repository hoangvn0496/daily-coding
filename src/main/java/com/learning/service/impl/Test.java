package com.learning.service.impl;

import com.google.common.base.CharMatcher;

class Test {

    public static final CharMatcher HIRAGANA
            = CharMatcher.inRange((char) 0x3040, (char) 0x309f);

    public static final CharMatcher KATAKANA
            = CharMatcher.inRange((char) 0x30a0, (char) 0x30ff);

    public static final CharMatcher KANA = HIRAGANA.or(KATAKANA);

    public static final CharMatcher KANJI
            = CharMatcher.inRange((char) 0x4e00, (char) 0x9faf);

    public static void main(String[] args) {
        test("つまり、任意売却をスムーズに進めることができる実力のある不動産会社を、あなたのご要望に応じてご紹介することが可能です。");
    }

    private static void test(String string) {
        System.out.println(string);
        System.out.println("Hiragana: " + HIRAGANA.retainFrom(string).length());
        System.out.println("Katakana: " + KATAKANA.retainFrom(string).length());
        System.out.println("Kana: " + KANA.retainFrom(string).length());
        System.out.println("Kanji: " + KANJI.retainFrom(string).length());
    }
}
