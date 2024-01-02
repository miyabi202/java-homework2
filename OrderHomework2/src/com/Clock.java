
	import javax.swing.*;
	import java.awt.*;
	import java.time.LocalDateTime;

	public class DateTimeUIExample {
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            JFrame frame = new JFrame("LocalDateTime UI Example");
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	            // 創建一個 JLabel 來顯示 LocalDateTime
	            JLabel dateTimeLabel = new JLabel();
	            dateTimeLabel.setFont(new Font("Arial", Font.PLAIN, 20));
	            frame.add(dateTimeLabel, BorderLayout.CENTER);

	            // 使用 Timer 定期更新 UI 上的 LocalDateTime
	            Timer timer = new Timer(1000, e -> {
	                LocalDateTime currentDateTime = LocalDateTime.now();
	                dateTimeLabel.setText("當前日期和時間: " + currentDateTime);
	            });
	            timer.start();

	            frame.setSize(400, 100);
	            frame.setVisible(true);
	        });
	    }
	}

	
	
	
	

}
