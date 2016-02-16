
/**
 * 红包对象
 * @author darwin
 *
 */
public class RedPacket {

	/**
	 * 剩余的钱
	 */
	private double leftMoney ;
	
	/**
	 * 红包数量
	 */
	private int count ;
	
	public double getLeftMoney() {
		return leftMoney;
	}

	public void setLeftMoney(double leftMoney) {
		this.leftMoney = leftMoney;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "RedPacket [leftMoney=" + leftMoney + ", count=" + count + "]";
	}
	
	
}
