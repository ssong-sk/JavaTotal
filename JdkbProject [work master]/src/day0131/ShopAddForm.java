package day0131;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ShopAddForm extends JFrame implements ActionListener {

	// 전역변수
	JTextField tfSang, tfSu, tfDan;
	JLabel lblphoto;
	String imageName;
	JButton btnImage, btnInsert;

	// db모델 생성 -> 생성하고 insertshop 가져옴.
	ShopDbModel model = new ShopDbModel();
	// 내부클래스
	PhotoDraw photoDraw = new PhotoDraw();

	public ShopAddForm() {
		super("추가폼");

		this.setBounds(200, 100, 400, 400);
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {

		this.setLayout(null);

		// 상품 입력
		JLabel lbl1 = new JLabel("상품명");
		lbl1.setBounds(20, 10, 60, 30);
		this.add(lbl1);

		tfSang = new JTextField();
		tfSang.setBounds(110, 10, 100, 30);
		this.add(tfSang);

		// 이미지 버튼
		JLabel lbl2 = new JLabel("사진선택");
		lbl2.setBounds(20, 60, 60, 30);
		this.add(lbl2);

		btnImage = new JButton("사진선택");
		btnImage.setBounds(110, 60, 100, 30);
		this.add(btnImage);
		btnImage.addActionListener(this);

		// 이미지추가
		photoDraw.setBounds(250, 10, 80, 90);
		this.add(photoDraw);

		// 이미지명
		lblphoto = new JLabel("이미지명");
		lblphoto.setBorder(new LineBorder(Color.blue));
		lblphoto.setBounds(20, 120, 300, 30);
		this.add(lblphoto);

		// 수량
		JLabel lbl3 = new JLabel("수량");
		lbl3.setBounds(30, 180, 50, 30);
		this.add(lbl3);

		tfSu = new JTextField();
		tfSu.setBounds(110, 180, 100, 30);
		this.add(tfSu);

		// 단가
		JLabel lbl4 = new JLabel("단가");
		lbl4.setBounds(30, 230, 50, 30);
		this.add(lbl4);

		tfDan = new JTextField();
		tfDan.setBounds(110, 230, 100, 30);
		this.add(tfDan);

		// db추가버튼 만들기
		btnInsert = new JButton("DB버튼 추가");
		btnInsert.setBounds(40, 300, 200, 30);
		btnInsert.addActionListener(this);
		this.add(btnInsert);

	}

	// canvas에 있는 어떠한 메서드가 필요하기 때문에 사용
	class PhotoDraw extends Canvas {

		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);

			if (imageName != null) {
				Image image = new ImageIcon(imageName).getImage();
				g.drawImage(image, 10, 10, 60, 70, this); // 부모 가져와서 입력
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == btnImage) {
			FileDialog dlg = new FileDialog(this, "이미지 가져오기", FileDialog.LOAD); // 파일 가져오기
			dlg.setVisible(true);

			// 취소누르면 머세더 종료
			if (dlg.getDirectory() == null) {
				return;
			}
			//이미지명 얻기
			imageName = dlg.getDirectory() + dlg.getFile();
			
			//라벨에 이미지명 출력
			lblphoto.setText(imageName);
			
			//이미지출력
			photoDraw.repaint(); //repaint로 이미지를 출력
		}
		else if (ob == btnInsert) {
			//ShopDto 생성
			ShopDto dto = new ShopDto();
			
			//dto에 4개의 테이터를 넣는다
			dto.setSangpum(tfSang.getText());
			dto.setPhoto(imageName);
			dto.setSu(Integer.parseInt(tfSu.getText()));
			dto.setDan(Integer.parseInt(tfDan.getText()));
			
			//db모델에서 insert메서드 호출
			model.insertShop(dto);
			
			//현재창 닫기
			this.setVisible(false);
		}

	}

//	public static void main(String[] args) {
//		new ShopAddForm();
//
//	}

}
