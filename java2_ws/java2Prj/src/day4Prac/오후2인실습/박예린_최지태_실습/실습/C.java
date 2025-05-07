package day4prac.실습;

public class C implements NPC {
	public boolean talking() {
        return NPC.talk(
            "안녕하세요! 여행자님! 여기 처음 오신 거죠? 무엇을 하고 싶으세요?\n1. 맛집을 추천받는다\n2. 재미있는 이야기 듣는다\n3. 길을 떠난다",
            "마을 북쪽 골목에 있는 빵집이 정말 맛있어요! 꼭 가보세요!",
            "얼마 전에 숲에서 요정이 나타났다는 소문이 있어요! 진짠지는 모르겠지만요!",
            "조심히 가세요! 다음에 또 들러주세요!"
        );
    }
}
