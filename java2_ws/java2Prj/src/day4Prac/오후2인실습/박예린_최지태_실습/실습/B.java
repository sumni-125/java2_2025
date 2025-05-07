package day4prac.실습;

public class B implements NPC {
	public boolean talking() {
        return NPC.talk(
            "……처음 뵙겠습니다. 무엇을 도와드릴까요?\n1. 조용한 장소를 추천받는다\n2. 마을에 대해 물어본다\n3. 길을 떠난다",
            "남쪽 숲 근처에 작은 연못이 있습니다.",
            "이 마을은 예로부터 여행자들에게 휴식처가 되어왔답니다.",
            "앞으로의 여행이 평안하길."
        );
    }
}
