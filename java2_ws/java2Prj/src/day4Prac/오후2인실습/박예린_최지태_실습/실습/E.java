package day4prac.실습;

public class E implements NPC {
	public boolean talking() { // 5. 인공지능
        return NPC.talk(
            "안녕하세요. 무엇을 도와드릴까요? \n1. 농담을 듣는다.\n2. 퀴즈를 받는다\n3. 길을 떠난다",
            "세상에서 가장 빨리 만든 떡은 뭘까요? 바로 '헐레벌떡' 이래요!",
            "시간이 지나도 오지 않는것은? 바로 내일 입니다.",
            "잘 가요."
        );
    }
}
