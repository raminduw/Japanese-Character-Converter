# Japanese-Character-Converter
This is java program to convert different Japanese to half-width katakana.


Problem : 

There are two types of Japanease characters.
01.Katakana 
02.Hiragana


In English as we know there Upper case and Lower case,Like that Katakana and Hiragana has Half-Width and Full-Width charatcters.

But issue is when compare Half-Width and Full-width characters using any String compare method(Eg.macthes()/equals()/contains()) ignoring case sensitivity ,it will not identify as same strings.

String a  =  "イワタニ";
String b  =  "ｲﾜﾀﾆ";

a.equalsIgnoreCase(b) returns false.


Solution:
I have write a program which will convert any String katakana(full or half) or Hiragana (full or half)
to Half-width katakana.
This will help to compare japanse string with diffrent characters.
