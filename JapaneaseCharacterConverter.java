public class JapaneaseCharacterConverter {

    private static final char[] ZENKAKU_KATAKANA = {'ァ', 'ア', 'ィ', 'イ', 'ゥ',
            'ウ', 'ェ', 'エ', 'ォ', 'オ', 'カ', 'ガ', 'キ', 'ギ', 'ク', 'グ', 'ケ', 'ゲ',
            'コ', 'ゴ', 'サ', 'ザ', 'シ', 'ジ', 'ス', 'ズ', 'セ', 'ゼ', 'ソ', 'ゾ', 'タ',
            'ダ', 'チ', 'ヂ', 'ッ', 'ツ', 'ヅ', 'テ', 'デ', 'ト', 'ド', 'ナ', 'ニ', 'ヌ',
            'ネ', 'ノ', 'ハ', 'バ', 'パ', 'ヒ', 'ビ', 'ピ', 'フ', 'ブ', 'プ', 'ヘ', 'ベ',
            'ペ', 'ホ', 'ボ', 'ポ', 'マ', 'ミ', 'ム', 'メ', 'モ', 'ャ', 'ヤ', 'ュ', 'ユ',
            'ョ', 'ヨ', 'ラ', 'リ', 'ル', 'レ', 'ロ', 'ヮ', 'ワ', 'ヰ', 'ヱ', 'ヲ', 'ン',
            'ヴ', 'ヵ', 'ヶ'};

    private static final char[] HANKAKU_HIRAGANA = {
            'ぁ', 'あ', 'ぃ', 'い', 'ぅ', 'う', 'ぇ', 'え',
            'ぉ', 'お', 'か', 'が', 'き', 'ぎ', 'く', 'ぐ',
            'け', 'げ', 'こ', 'ご', 'さ', 'ざ', 'し', 'じ',
            'す', 'ず', 'せ', 'ぜ', 'そ', 'ぞ', 'た', 'だ',
            'ち', 'ぢ', 'っ', 'つ', 'づ', 'て', 'で', 'と',
            'ど', 'な', 'に', 'ぬ', 'ね', 'の', 'は', 'ば',
            'ぱ', 'ひ', 'び', 'ぴ', 'ふ', 'ぶ', 'ぷ', 'へ',
            'べ', 'ぺ', 'ほ', 'ぼ', 'ぽ', 'ま', 'み', 'む',
            'め', 'も', 'ゃ', 'や', 'ゅ', 'ゆ', 'ょ', 'よ',
            'ら', 'り', 'る', 'れ', 'ろ', 'ゎ', 'わ', 'ゐ',
            'ゑ', 'を', 'ん', 'ゔ', 'ゕ', 'ゖ'};

    private static final String[] HANKAKU_KATAKANA = {"ｧ", "ｱ", "ｨ", "ｲ", "ｩ",
            "ｳ", "ｪ", "ｴ", "ｫ", "ｵ", "ｶ", "ｶﾞ", "ｷ", "ｷﾞ", "ｸ", "ｸﾞ", "ｹ",
            "ｹﾞ", "ｺ", "ｺﾞ", "ｻ", "ｻﾞ", "ｼ", "ｼﾞ", "ｽ", "ｽﾞ", "ｾ", "ｾﾞ", "ｿ",
            "ｿﾞ", "ﾀ", "ﾀﾞ", "ﾁ", "ﾁﾞ", "ｯ", "ﾂ", "ﾂﾞ", "ﾃ", "ﾃﾞ", "ﾄ", "ﾄﾞ",
            "ﾅ", "ﾆ", "ﾇ", "ﾈ", "ﾉ", "ﾊ", "ﾊﾞ", "ﾊﾟ", "ﾋ", "ﾋﾞ", "ﾋﾟ", "ﾌ",
            "ﾌﾞ", "ﾌﾟ", "ﾍ", "ﾍﾞ", "ﾍﾟ", "ﾎ", "ﾎﾞ", "ﾎﾟ", "ﾏ", "ﾐ", "ﾑ", "ﾒ",
            "ﾓ", "ｬ", "ﾔ", "ｭ", "ﾕ", "ｮ", "ﾖ", "ﾗ", "ﾘ", "ﾙ", "ﾚ", "ﾛ", "ﾜ",
            "ﾜ", "ｲ", "ｴ", "ｦ", "ﾝ", "ｳﾞ", "ｶ", "ｹ"};


    private static final char ZENKAKU_KATAKANA_FIRST_CHAR = ZENKAKU_KATAKANA[0];

    private static final char ZENKAKU_KATAKANA_LAST_CHAR = ZENKAKU_KATAKANA[ZENKAKU_KATAKANA.length - 1];
    
    private static final char HANKAKU_HIRAGANA_FIRST_CHAR = HANKAKU_HIRAGANA[0];

    private static final char HANKAKU_HIRAGANA_LAST_CHAR = HANKAKU_HIRAGANA[HANKAKU_HIRAGANA.length - 1];

    private static String zenkakuKatakanaToHankakuKatakana(char c) {

        if (c >= ZENKAKU_KATAKANA_FIRST_CHAR && c <= ZENKAKU_KATAKANA_LAST_CHAR) {
            return HANKAKU_KATAKANA[c - ZENKAKU_KATAKANA_FIRST_CHAR];
        } else {
            return String.valueOf(c);
        }

    }


    private static char hankakuKatakanaToZenkakuKatakana(char c) {

        if (c >= HANKAKU_HIRAGANA_FIRST_CHAR && c <= HANKAKU_HIRAGANA_LAST_CHAR) {
            return ZENKAKU_KATAKANA[c - HANKAKU_HIRAGANA_FIRST_CHAR];
        } else {
            return c;
        }

    }


    public static String zenkakuKatakanaToHankakuKatakana(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char originalChar = s.charAt(i);
            char converted = hankakuKatakanaToZenkakuKatakana(originalChar);
            String convertedChar = zenkakuKatakanaToHankakuKatakana(converted);
            sb.append(convertedChar);
        }
        return sb.toString();
    }
	  public static void main(String[] args) {
	 
		  String s1 = zenkakuKatakanaToHankakuKatakana("イワタニ");
		  String s2= zenkakuKatakanaToHankakuKatakana("ｲﾜﾀﾆ");
		  String s3= zenkakuKatakanaToHankakuKatakana("いわたに");
		 
		  System.out.println("S1 : "+s1);
		  System.out.println("S2 : "+s2);
		  System.out.println("S3 : "+s3);
		  
		  if(s1.contains(s2)){
			  System.out.println("S1 and S2 SAME");
		  }
		  
		  if(s1.contains(s3)){
			  System.out.println("S1 and S3 SAME");
		  }
		  
		  if(s2.contains(s3)){
			  System.out.println("S2 and S3 SAME");
		  }
		
	  }
	}
