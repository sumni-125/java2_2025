package day4Pracc;

public class 우주연점원   implements  점원 {

	@Override
	public void 인사하기() {
	    System.out.println("🌸 안녕하세욧! 저는 오늘도 활짝  >_<  🌸");
	}

	@Override
	public void 진열하기() {
	    System.out.println("🧸 예쁘게~ 반짝반짝✨ 진열 완료!  책 종류별로 진열 완료했습니다! 🧁");
	    System.out.println("🧸 신간과 베스트셀러를 따로 진열 !!   🧁");
	    System.out.println("🧸 사은품을 주는 책들은 따로 이벤트코너에 진열완료했습니다  🧁");
	}

	@Override
	public void 판매하기() {
	    System.out.println("🎀 감사합니당! 정성껏 포장해서 드릴게요옷~ 쓱쓱 ✨ 꾹꾹 💝");
	}


}
