
public class HelpMe {

	private static int existanceIsPain(byte[] array, int offset, int bits) {
		int byteOffset = offset / 8;
		int bitOffset = offset % 8;
		int result = 0;
		for (int i = 0; i < bits; i++) {
			byte cb = array[byteOffset];
			byte bit = (byte) (cb & (1 << bitOffset));
			result = result | bit;
			bitOffset++;
			if(bitOffset>=8) {
				byteOffset++;
				bitOffset = 0;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		byte[] bytes = {(byte) 100, 1};
		System.out.println(existanceIsPain(bytes, 0, 10));
	}

}
