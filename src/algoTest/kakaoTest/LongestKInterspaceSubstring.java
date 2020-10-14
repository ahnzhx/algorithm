package algoTest.kakaoTest;

public class LongestKInterspaceSubstring {
    public static String longestKInterspaceSubstring(String word, int k) {
        char[] wordCharArr = word.toCharArray();
        String smallerAnswer = "";
        String biggerAnswer = "";

        for(int i = 0; i< wordCharArr.length-1 ; i++){
            int min = Math.min(wordCharArr[i], wordCharArr[i+1]);
            int max = Math.max(wordCharArr[i], wordCharArr[i+1]);

            if(max - min <= k){
                if(smallerAnswer.isEmpty()){
                    smallerAnswer += wordCharArr[i]+"";
                }
                smallerAnswer += wordCharArr[i+1]+"";

            } else {
                smallerAnswer ="";
            }
        }
        if(smallerAnswer.length() > biggerAnswer.length()){
            biggerAnswer = smallerAnswer;
        }
        return biggerAnswer;
    }

    public static String longestKInterspaceSubstringw(String word, int k) {
        // Write your code here
        char[] wordCharArr = word.toCharArray();
        StringBuffer answer = new StringBuffer();

        for(int i = 0; i< wordCharArr.length-1 ; i++){
            int min = Math.min(wordCharArr[i], wordCharArr[i+1]);
            int max = Math.max(wordCharArr[i], wordCharArr[i+1]);

            if(max - min <= k){
                if(answer.toString().isEmpty()){
                    answer.append(wordCharArr[i]+"");
                }
                answer.append(wordCharArr[i+1]+"");
            } else if(!answer.toString().isEmpty()){
                break;
            }
        }
        return answer.toString();
    }


    public static void main(String[] args) {
        String word = "wedding";
        String word2 = "ababbacaabbbb";
        String wp = "azp";


        String word3 = "bhljuexsyuuvyhztsimgvoxiyycuzeasmzghajvrjnykbdhyreufwirlccjhtfjuqvzidfdyidtxnikriwrvtoqenazltkbjstmrwtgdkwvschwpgfzqsacuuvjfpadbohqnywgsntoqquburdtpfpptrkfcsdcevbmcmhecxncrdirkwbmvqgynabprmdbjwhbcrncwdukokijzenidfqcrezgfxvatqffxezguqyztqargorrzknklmjfikrvatzstlmwjjrypjimkwzybcbinumkoiosqypajdajcphqdndcmvygsjjfreddemldzurfeeelztblokbfprielfojcgilsrxalovpxjchpufxerhhbgnhjjsrupofxjrimgndpnomkyzfqiqjxqxbtvmxvyrzmsgzwcgqquekxqjwfudqzydncuizvkzawcteorormmaqoiacevzqqjrwfhoshrepkcynkwdrkoeqesurqtzcqcdaonfsuwcuaokhimsynoyfwprdmhyesfpcxnmurltmwqwwenzmxjgopkcifomcjonllrdpwmtzubsoinwnlqcszsealyvnhwjnnuxkwyiopsmtvivjbcrkcxsrmopbchayttisbzxktfxwenesgysuwvkfdwkagbdlpfzayxlntwykyyuewfzifjwwjnxjbknzfqezipnkkjkrnqethkpblnqusmhdfhkjkvelytlqnltmbbsurveyegehkofkutdekhemnmyqvhwwurhsuounbjzwhicxibfghjykectxtdyfhyybljnfvowjaizjffzpxnwcqahlzlfikhslacbfghdwvtqfqqxbqbmxksbiiypozbsyybmdzfrhxprmmgmmrpmtcajbsdstjjowhqwrsuzzvttmmksmsxghtsqgesrczefrzcfprtxvegkuzlypsjbhahbilioibyxifzjpzsrjpfelrzktziuojdbmdnknjzorzcawbsalusvdufbnamdirsmuijsmuuugnqovtwqgutqhpvqwlyycygirhusujqqvnpvwqsgstoscmclnbfytsuxzclhsfzfxkxsfjxkvabuttbscomybdepwrqndoppvtikpmqkdsjixsocbzbswooayozoyrzyhbushytgvprajdcstirvvwkaznlhcxdqejuqpjuhwfqeseigscrstbxqvyfpnwxztvhqxgbbslffitlsxdqvaextbexuwwdiejfsmdmgfpounfywkuyypnyucmibazrcbivlwzszsfjhvkvpcbqbuqdllgcvqjibrfazennnmffpyheodzfldmnradktpbjkkpqvyhygxlunqhqtxnadioghyjomokbtavxyfbidmelfqrsfxekbqxuuwehghvbnavvjrgdjgczvfcponryacggjmfzvalipnpmxbjefhujbgymqjaullceylijkaspltedadskhefbkqrqtsgbdtxwkzyaqyqemwcjysfkvzwgqcnuzgendculxttrdsxsxmxqfdgutpnyjolknsiuezcvujxlpotblpmpgjjvukpjitayuahcttxdmomludxesiutmpxnpqnrkolmbsdtdoksakpgfyozgnsgtbfbedwoghhhyndyzpezihblyfvigwhkqfygzwcbmbpiimeogzoqhdwisfanuncucocgaqwkobzfidbbqgmaqqzdvfafmczdhuzkkmcvjgejgayrjarlurbmhvhosojxqdzznqpkropeexnjtsqkaienkgcibbtxashzzdnfdliciyyghecxlebapsexthlfulocnrsmlcqgkaqslqfiapoeuqrzjfswmonxlixmitdpafnndsifnrvdrsddkgdniojhnpmokhhiverylrhdrxyoqhbxnpsiktchnrhlbzahwzmjjvedyrtldihjetjwpycxpoccatlxigqodlsakvgetsaoubsezeyszapiyapwuaeisdzckiuuxtisywjsnhtlzptnojwbckpnabscvivbqdtgmgdsxqpxrebdovsgbksxugusjncvwqhwvaeezmkajhjiebbdpgtfqrnrjequlgeynvtrygkeqpqmjaigoepbfqguqkadvesqhcxmfsgilnlqcopfjekzzgtbymrfxkserpbwbcnpkkwhqfojvtpeuxjyiyitmgvyqfszsqgsmspbqoozqhisbwosdphwrdnxpknoqjiyavzfrvzwtlvqmuccymzivacvmqmbrwnthqqwadbpxhngtvvzvqieetfymhqedcxwhpkonbjnkudvfivhebhsnzsxzzjaddyqpktcvkgfejyixagxbdsicgvwqtlroyvxvgjdtvuukpniubgeenyppzyhsewdpocrchiqhcngcfopcbykcttgfwdfniwhzjnzoofmamkcuqgpmeywjfqfowfqxlyryekxogkjtowfjxdgowypixismveecselbbryhtswxgkfrydldvekuvkvsjcavjvhhclhavrywrckyfhwmzmqfbtbigbyjgrrkehtkmyhhtwnzjjktyvzbaqyuusdfguliqqkxuiqhkedftupgkmocgiroddijslfinxhytanzqqlhptrnybbuuyuthofrlwbzxsftflqwblleaecbzhdpqdmyxqgjvnetpyyzwefgbvsbjgbmrhqczriujldtqpolsmdgehwsmrczmfgbugfiomwfbwpxwvluaorgczsgxkzotrlsdkodqczcpvjhcpporirercxgxfwjekvvonigchggrzjueyskjhzokxmzkldnjcimunboojaqzvcdpmsonsfoowlreikclgqjamjvtmdskdpyotvojllpxoqxfzkgfhvmckjlhapayylkdiiptotsrjvyhmcomxsbyxqxxqpgfgenxeqndjcjlvqxsqioyvqgleazxszwccdkpzwmlzmasoaaryphmijhjuqpgwpunuimyiaylayazpnulmsphyqjxroujvoyddahutpacfuebouhppvrsavfkandiqeuoedxkqfkutogoesxhfsnvknivrieoojvsbvcuwhpjjthljozuatuoihddpluzxxnklwrkmkhnrehgbnjsmbcenyjcrwyzzgaqsfouwimwjlqgpygkqtsizszroumhkecovugpbhbiezjgduyilhyphsxkcbowigfpusgpcuopbtvhkofupvxklrfqemwjymbxdtauvmlmhzqtwqgryrvuaykxryxjbiqicsgyksoojojlqexosacjbjrplryelvmnrqodzemnbavywgwbuhffigvudtnqdtdkdxzxihlsvypqkogiylxvchdbruosugupkmdwkuepzkvmrnsylccpduzgvwndlepfvyhtytkggxrzofupbupqcjzxwdvxufiqwguwulkrlpzlxqbnxtdwuiemmpumhakpuchklyrtiorrqzapnwdhzuvcbzttlxygpnragvawbhkfrpqskskmkpiypqgymlqicwvflfltkkejqotaydqbdflqpnolwdasqvkxbvvfmasnwwhwqufkfnisaxzynjjddrxgvxktyiogjiwnyrulrxthfkbecgwbldqbpbzzudvajozhmlxtkiltqcclgfdmasdietvjglejokfociswlqxtbfhyoxwuronqlgjfjkphapcmcnbtgfgvludaoyhxseakzasslxvatvlejvsladkvjjmetfwpnnlorpemmamqhmpgkzzbxxzqwmbwfycgwemvvpyeoycgfsvwmutczfqwtusngsdktdufrycyfinzrvjflbzbpvreypnqhzzpkmnyzqqwvisnivsuozvdmtgzhzesfmxcyblrsdpqkxyqovfseuebeysdiqflwnjzplnserntnodwzmfvnatoxsjrclzfzhxjqqmnqdzxwdcssgeblgrezgwknapvbsppitfedryvzxqdzxvdiyuajycpbxxkpkhdekgxhyjzgcheedyszlihjfossmjdbouwttystfvpkbhcdyxmzeyqibqledsvjnyffidkkwbourovzndkfxnlpsizxkemavarmqelsnpgjezgfacbxzgxpvimbmambsvwmqbzilvpqjtcmbgerufbtbeqpmfgiwrughddpejuornucejnyfijstrzoneizbrgogturzfljgckyxdngrvawclptfrnvrwrwvurzmvxtkixllivrkcfxlguvlmngyfcdjqflggiunvhvuzkxhvqnwymjztermppcxqrgeobrbpargqlraqrjwkfnzgnudranaxqfmsaantchudfhvmuwfrbhmssgzxdxrfkxrytlbyaeflklvxhzpvafeunvqeiadxxclrotkfcymnkgygghtkuacbaoazpsbxjzmfidjpsaoiozjvulmcuzguyhphrgietadphlirgbmvmonsljumqrlengezdpchpfkwoyteprqyjbjupamjxeovuhueuxeuxfgnltehtouiepnlmrgltedeokmmiwbonglzcuuzzzfyuwbollpptcijkmsmhueevchpiuprshexwdfmwfgxccblwrkapnvplvoknfcrulvfjfnyzmtfjummlhpippsmfqfocmhkdgizkrsacjysnqskvpungzhzdgxwejklehueubwyinmebajhezjrcgoqielfzwhnsdcrctmrochftxuxicbagbnesyhdspbazhfxbdjunghnnogatkkaknajopclxaeyhjcmufbaoubmspuwhsdazfikvszhyunqiavavyyqcqzcgzsvxomrenckzcogkgnjdoyawvshefm";

        System.out.println(longestKInterspaceSubstring(word3, 22));
    }
}
