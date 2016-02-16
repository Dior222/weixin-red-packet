import java.util.Random;

/**
 * 抢红包
 * @author darwin
 *
 */
public class WeixinRedPacketMain {

	public static double getRandomMoney(RedPacket packet) {

		System.out.println(packet);
		// 如果红包数量只剩下一个，则返回剩余的钱
		if (packet.getCount() == 1) {
			packet.setCount(packet.getCount() - 1);
			//保留两位小树
			double money = (double)Math.round(packet.getLeftMoney() * 100) / 100;
			packet.setLeftMoney(0);
			return money;
		}

		Random random = new Random();
		double min = 0.01;
		double max = packet.getLeftMoney() / packet.getCount() * 2;
		double money = random.nextDouble() * max;
		//保留两位小数
		money = Math.floor(money * 100) / 100;
		money = money <= min ? min : money;
		packet.setLeftMoney(packet.getLeftMoney() - money);
		packet.setCount(packet.getCount() - 1);

		return money;

	}

	/**
	 * 模拟抢红包
	 * @param args
	 */
	public static void main(String[] args) {

		double money = 10.00;
		int count = 10;

		RedPacket redPacket = new RedPacket();
		redPacket.setLeftMoney(money);
		redPacket.setCount(count);

		double packet = 0.0;
		for (int i = 1; i <= count; i++) {
			packet = getRandomMoney(redPacket);
			System.out.println(String.format("get red packet for the %d time, money is %f...", i, packet));
		}
		System.out.println("get red packet finished. left money is " + redPacket.getLeftMoney() + ",left count is "
				+ redPacket.getCount() + " .");
	}
}
