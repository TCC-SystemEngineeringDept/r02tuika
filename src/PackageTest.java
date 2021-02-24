import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PackageTest {

	@Test
	void testGetMaxSize() {
		// 10個入るパッケージを設定
		Package p = new Package(10);
		//パッケージ1個では最大10個入る
		assertEquals(10, p.getMaxSize(1));
		//パッケージ2個では最大20個入る
		assertEquals(20, p.getMaxSize(2));
	}

}
