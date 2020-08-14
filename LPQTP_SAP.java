import java.util.Base64;
public class LPQTP_SAP {

	public static void main(String[] args) throws Exception {
		System.out.println(new String(getPassword(Base64.getDecoder().decode(args[0]))));
	}
	public static byte[] getPassword(byte[] aByteArray)
			throws Exception
	{
		if ((aByteArray == null) || (aByteArray.length == 0)) {
			throw new Exception(" no password given ");
		}
		if (aByteArray[0] != 1) {
			return null;
		}
		int len = aByteArray.length;
		byte[] result = new byte[len - 1];
		for (int i = 1; i < len; i++) {
			result[(len - 1 - i)] = ((byte)(aByteArray[i] ^ 0x74));
		}
		return result;
	}
}
