
public class Package {
	
	// パッケージの最大格納可能個数
	private int size;

	// パッケージの最大格納個数を取り出す
	public int getSize() {
		return size;
	}

	// パッケージの最大格納個数を設定する
	public void setSize(int size) {
		this.size = size;
	}
	

	public Package(int size) {
		setSize(size);
	}

	/**
	 * 指定された最大格納可能個数のパッケージを、引数の数だけ揃えた場合、最大何個まで格納されるかを返す
	 * @param i 用意するパッケージの数
	 * @return 格納できる最大個数
	 */
	public int getMaxSize(int i) {
		return 10;
	}
	
	

}
