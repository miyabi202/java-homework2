package com;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextArea;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class Order2UI extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final JLabel petname = null;
	private JPanel contentPane;
	private JTextField date;
	private JTextField Oname;
	private JTextField Pname;
	private JTextField CanQ;
	private JTextField DailyQ;
	private JTextField ToyQ;
	private JTextField outputSum;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	protected JLabel oweername;
	protected JLabel showhere;
	protected AbstractButton rdbtnNewRadioButton;
	protected boolean isMember;
	private JTextField pay;
	private JLabel payResult;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order2UI frame = new Order2UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Order2UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,600, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(28, 28, 28));
		panel.setBounds(0, 6, 524, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NINI Store");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(238, 238, 238));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 22, 200, 34);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(28, 28, 28));
		panel_1.setBounds(10, 80, 323, 426);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Owner Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(6, 76, 115, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pet Name");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(6, 105, 115, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 =  new JLabel("CannedFood");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1_1.setBounds(6, 212, 115, 30);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("DailyDogFood");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1_1_1.setBounds(6, 254, 115, 30);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Pet Toys");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1_1_1_1.setBounds(6, 296, 115, 30);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		date = new JTextField();
		//使用 JTextField 组件创建文本字段：
		//JTextField dateTextField = new JTextField();
		
		//获取当前日期：
		//使用 java.util.Date 类或 java.time.LocalDate 类获取当前日期。例如：
		/*import java.text.SimpleDateFormat;
		import java.util.Date;

		// 获取当前日期
		Date currentDate = new Date();
        或者使用 Java 8 以后的 LocalDate 类
		 LocalDate currentDate = LocalDate.now();
*/
		
		date.setBounds(120, 51, 155, 26);
		panel_1.add(date);
		date.setColumns(10);
	
		  // 获取当前日期并格式化
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = now.format(formatter);


        // 設定當前日期到日期文本框
        date.setText(formattedDate);
        /**在這個例子中，我們使用 LocalDate.now() 獲取當前日期，
         * 然後使用 DateTimeFormatter 進行格式化。
         * 最後，我們將格式化後的日期設定到 date 文本框中。
         * 請注意，你需要確保 date 文本框的作用域在整個 Order2UI 類中可見。*/


        // 设置 JFrame 可见性
       // date.setVisible(true);
      //  date.setText("當前日期和時間: " + currentDateTime);
        
		// 獲取當前日期
        //LocalDate now = LocalDate.now(Clock.systemDefaultZone());
       // System.out.println(now);//c2023-12-27
     // 设置日期到文本字段
       // date.setText();
        
		
		JLabel lblNewLabel_2 = new JLabel("訂單系統");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(6, 6, 130, 30);
		panel_1.add(lblNewLabel_2);
		
		
		
		  boolean member = false;//= buttonGroup.isSelected(buttonGroup.getSelection());
	       System.out.println(buttonGroup.getButtonCount());		       
	   /*    if (buttonGroup.isSelected(buttonGroup.getSelection())==true) {
		       System.out.println(buttonGroup.getButtonCount());
		      // System.out.println(buttonGroup.getSelection().getActionCommand());
		      
		       if(buttonGroup.getSelection().getActionCommand()=="member") {
		    	   member=true; 
		       }		    	   
	       }*/

		JLabel lblNewLabel_1_2_2 = new JLabel("Product Name");
		lblNewLabel_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_2_2.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_2_2.setBounds(6, 182, 115, 30);
		panel_1.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Price");
		lblNewLabel_1_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_2_2_1.setBounds(133, 182, 47, 30);
		panel_1.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Quantity");
		lblNewLabel_1_2_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_2_1_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_2_2_1_1.setBounds(192, 182, 68, 30);
		panel_1.add(lblNewLabel_1_2_2_1_1);
		
		Oname = new JTextField();
		Oname.setColumns(10);
		Oname.setBounds(120, 79, 155, 26);
		panel_1.add(Oname);
		
		Pname = new JTextField();
		Pname.setColumns(10);
		Pname.setBounds(120, 108, 155, 26);
		panel_1.add(Pname);
		
		CanQ = new JTextField();
		CanQ.setColumns(10);
		CanQ.setBounds(192, 215, 62, 26);
		panel_1.add(CanQ);
		
		DailyQ = new JTextField();
		DailyQ.setColumns(10);
		DailyQ.setBounds(192, 257, 62, 26);
		panel_1.add(DailyQ);
		
		ToyQ = new JTextField();
		ToyQ.setColumns(10);
		ToyQ.setBounds(192, 299, 62, 26);
		panel_1.add(ToyQ);
		
		outputSum = new JTextField();
		outputSum.setBounds(213, 375, 99, 29);
		panel_1.add(outputSum);
		outputSum.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Total");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1_1_1_1_1.setBounds(145, 373, 115, 30);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("YES");
		rdbtnNewRadioButton.setActionCommand("member");
		buttonGroup.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton.setBounds(120, 147, 93, 23);
		panel_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		
		JRadioButton rdbtnNewRadioButtonNO = new JRadioButton("NO");
		rdbtnNewRadioButtonNO.setActionCommand("nomember");
		buttonGroup.add(rdbtnNewRadioButtonNO);
		rdbtnNewRadioButtonNO.setBounds(203, 146, 86, 30);
		panel_1.add(rdbtnNewRadioButtonNO);
		rdbtnNewRadioButtonNO.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButtonNO.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("MemberShip");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(6, 147, 130, 30);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Date");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_2.setBounds(6, 48, 115, 30);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("150");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(133, 220, 61, 16);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("880");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setBounds(133, 262, 61, 16);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("250");
		lblNewLabel_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_3_1_1.setBounds(133, 304, 61, 16);
		panel_1.add(lblNewLabel_3_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(26, 26, 26));
		panel_3.setBounds(323, 70, 207, 436);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea showhere = new JTextArea();
		showhere.setForeground(new Color(255, 255, 255));
		showhere.setBackground(new Color(109, 93, 113));
		showhere.setBounds(8, 75, 195, 257);
		panel_3.add(showhere);
		
		JLabel lblResult = new JLabel("Order Information");
		lblResult.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblResult.setForeground(new Color(242, 214, 255));
		lblResult.setBounds(8, 23, 184, 23);
		panel_3.add(lblResult);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  try {
                      showhere.print();
              } catch (PrinterException e1) {
                      // TODO Auto-generated catch block
                      e1.printStackTrace();
              }
        }
		
				
			
		});
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(8, 344, 92, 26);
		panel_3.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				userUI page = new userUI();
                page.setVisible(true);
                dispose();
                
			}
		});
		
		btnNewButton_1.setBounds(107, 346, 92, 26);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("離開");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				  System.exit(0);
			}
		});
		
		
		btnNewButton_2.setBounds(8, 380, 92, 26);
		panel_3.add(btnNewButton_2);
		/*
		JButton btnNewButton_2_1 = new JButton("結帳");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				control.PayUI p=new com.PayUI();
				
				p.setVisible(true);
				dispose();
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		        catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	       
	
		});
		btnNewButton_2_1.setBounds(107, 384, 92, 26);
		panel_3.add(btnNewButton_2_1);
		
	      */
		
		JButton submit = new JButton("Submit");
		submit.addMouseListener(new MouseAdapter() {
			
	
		//	private JLabel showhere;

			@Override
			public void mouseClicked(MouseEvent e) {
				
				// 取得會員選擇
	   

		      /* boolean member = false;//= buttonGroup.isSelected(buttonGroup.getSelection());
		       System.out.println(buttonGroup.getButtonCount());		
		     
		       
		    	   if (buttonGroup.isSelected(buttonGroup.getSelection())==true) {
		    		   
			       System.out.println(buttonGroup.getButtonCount());//2
			       System.out.println(buttonGroup.getSelection().getActionCommand());//2
			       if(buttonGroup.getSelection().getActionCommand()=="member") {
			    	   member=true;
			       }
		       }
			    	   */
		    	   
		    	   
		    	   boolean member = false;
		    	  // if (buttonGroup.isSelected(buttonGroup.getSelection())) {
		    		   if (buttonGroup.getSelection() != null) {
		    		   
		    	       System.out.println(buttonGroup.getButtonCount());//2
		    	       System.out.println(buttonGroup.getSelection().getActionCommand());//nomemmber
		    	       
		    	       if("member".equals(buttonGroup.getSelection().getActionCommand()))
		    	       {
		    	           member = true;
		    	       
		    	       }
		    	   }
		    	   /*在你的程式碼中，你使用了 buttonGroup.isSelected(buttonGroup.getSelection()) 來判斷 
		    	    * JRadioButton 是否被選中。這個判斷方式可能不是最佳的，
		    	    * 因為 buttonGroup.getSelection() 已經返回了選中的按鈕，
		    	    * 而不需要再使用 isSelected 進行額外的判斷。
		    	    * 
		    	    * if (buttonGroup.getSelection() != null) {
                     // 有按鈕被選中
                     // ...}

		    	    * **/
			    	   
			     /*這段程式碼主要是針對一組 JRadioButton (單選按鈕) 進行操作，判斷使用者是否選擇了其中的某個按鈕，並且根據選擇情況設定一個 boolean 變數 member。

讓我們逐行解釋：

boolean member = false; - 首先，宣告一個 boolean 變數 member，並將其初始值設為 false。

System.out.println(buttonGroup.getButtonCount()); - 這行程式碼用來輸出這個 ButtonGroup（按鈕組）中按鈕的總數。ButtonGroup 是一種用來管理 JRadioButton 的容器，確保在同一個 ButtonGroup 中，只能選擇其中的一個按鈕。

if (buttonGroup.isSelected(buttonGroup.getSelection()) == true) - 這個條件判斷是否有按鈕被選擇。buttonGroup.getSelection() 返回被選擇的按鈕，buttonGroup.isSelected() 則判斷是否有按鈕被選擇。如果有按鈕被選擇，這個條件就成立。

System.out.println(buttonGroup.getButtonCount()); - 這行程式碼再次輸出 ButtonGroup 中按鈕的總數，這次是在確定有按鈕被選擇後輸出。

System.out.println(buttonGroup.getSelection().getActionCommand()); - 這行程式碼輸出被選擇的按鈕的操作命令（Action Command）。在 JRadioButton 中，你可以為每個按鈕設定一個唯一的操作命令，用來識別不同的按鈕。

if (buttonGroup.getSelection().getActionCommand() == "member") - 這個條件判斷被選擇的按鈕的操作命令是否為 "member"。如果是，則將 member 設為 true，表示會員被選擇了。

總的來說，這段程式碼是為了判斷在一組 JRadioButton 中是否有按鈕被選擇，以及被選擇的按鈕的操作命令是否為 "member"，並根據這些情況設定 member 變數。最後，member 變數的值將反映出會員是否被選擇。

**/
				 
				 
			       // boolean isMemberStatus = isMember.isSelected();
			     // 建立 Order 物件並傳遞 sum 參數
			       // Order2 o = new Order2(petName, ownerName, CannedQ, DAILYQ, TOYQ, isMemberStatus);
			        
			        // 計算總價
			        // calculateSum();

			        // 判斷是會員還是不是會員
			       // 根據選中的單選按鈕更新 isMemberStatus
			        
			        // 建立 Order 物件並傳遞 sum 參數
		    		   
		    		// 獲取當前日期和時間並格式化
		    	        LocalDateTime now = LocalDateTime.now();
		    	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		    	        String formattedDateTime = now.format(formatter);
	
		    	        
		    		   String PNAME = Pname.getText();
		    		   String ONAME = Oname.getText();
		    		   Integer CANQ, DAILYQ, TOYQ;

		    		  // try {
		    		       CANQ = Integer.parseInt(CanQ.getText());
		    		       DAILYQ = Integer.parseInt(DailyQ.getText());
		    		       TOYQ = Integer.parseInt(ToyQ.getText());
		    		/*   } catch (NumberFormatException ex) {
		    		       // 適當的錯誤處理，例如彈出錯誤視窗，要求使用者輸入正確的數字格式
		    		       return;}*/
		    		   
			    
			        //String PNAME = Pname.getText();
					 //String ONAME = Oname.getText();
					 
				     //Integer CANQ = Integer.parseInt(CanQ.getText());
				    // Integer DAILYQ = Integer.parseInt(DailyQ.getText());
				     //Integer TOYQ = Integer.parseInt(ToyQ.getText());
				    
		    		    
			
				  Order4 o = new Order4( ONAME,PNAME,CANQ, DAILYQ, TOYQ, member);
			      showhere.setText(formattedDateTime);
               //  sum.setText()
		           outputSum.setText(o.getSum().toString());
		          
		           showhere.setText("Owner name:"+o.getOname()+ 
			        		"\nPet name:"+o.getPname()+
			        	
			                "\nCannedFood quantity  :" + o.getCanQ() +
			                "\nDailyDogFood quantity:" + o.getDailyQ() +
			                "\nToys 	quantity" + o.getToyQ() +
			                "\nTotal Price:" + o.getSum());
			       
		           try {
						FileOutputStream fos= new FileOutputStream("order2Info.txt");
						ObjectOutputStream oos= new ObjectOutputStream(fos);
						oos.writeObject(o);
		           
				
					
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				        catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			       
			     /*  showhere.setText("Owner name:" + o.o.getOname() +
			    	        "\nPet name:" + o.getPname() +
			    	      /  "\nCanQ:" + o.getCanQ() 
			    	        "\nDailyQ:" + o.getDailyQ() +
			    	        "\nToyQ:" + o.getToyQ() +
			    	        "\n總價:" + o.getSum());  
			    	        */
			       /* if (o != null) {
			            String outputText= "擁有者姓名：" + (o.getOname() != null ? o.getOname() : "") +
			                    " 寵物姓名：" + (o.getPname() != null ? o.getPname() : "") +
			                    "\n罐頭數量：" + (o.getCanQ() != null ? o.getCanQ() : "") +
			                    "\n每日數量：" + (o.getDailyQ() != null ? o.getDailyQ() : "") +
			                    "\n玩具數量：" + (o.getToyQ() != null ? o.getToyQ() : "") +
			                    "\n總價：" + (o.getSum() != null ? o.getSum().toString() : "");

			            outPut.setText(outputText);
			        } else {
			            // 處理 'o' 為空的情況
			            outPut.setText("資料不可用");
			        }
			*/
		
		    		  	}});
		submit.setForeground(new Color(241, 241, 241));
		submit.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		submit.setBounds(6, 375, 117, 29);
		panel_1.add(submit);
		
	}
}
