package day4prac.실습;

public class A implements NPC {
    public boolean talking() {
        return NPC.talk(
            "안녕하세요, 여행자님. 저희 마을에 방문해주셔서 감사합니다.\n1. 여관이 어디 있는지 물어본다.\n2. 이야기를 나눈다.\n3. 길을 떠난다",
            "여관이라면, 마을 중앙에 있답니다.",
            "공원에 꽃이 만개했답니다. 한 번 구경해보시겠어요?",
            "길이 험할 테니 조심하세요."
        );
    }
}
