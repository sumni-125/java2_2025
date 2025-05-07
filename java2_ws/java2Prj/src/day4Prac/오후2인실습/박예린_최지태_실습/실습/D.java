package day4prac.실습;

public class D implements NPC {
	public boolean talking() { // 4. 진지한 마을 주민
        return NPC.talk(
            "네 안녕하세요. 뭘 원하세요.\n1. 퀘스트를 받는다\n2. 소문을 듣는다\n3. 길을 떠난다",
            "옆마을에 가서 슬라임 좀 죽여주세요.",
            "북쪽에 있는 나라에서 전쟁을 준비한다는 소문이 있네요.",
            "잘 가요."
        );
    }
}
