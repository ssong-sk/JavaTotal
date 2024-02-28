package day0131;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//시퀀스  상품명  수량  단가  총금액  출력
//테이블에서 상품을 클릭하면 우측에 이미지 나오게 Canvas 내부클래스 구현

public class ShopListFrom extends JFrame {

	ShopDbModel dbModel = new ShopDbModel(); // 호출받아서 출력

	// 이미지 출력 위한 내부클래스
	ImageDraw draw = new ImageDraw();
	String imageName;

	// 테이블 (추가, 삭제 가능하게 )
	DefaultTableModel model;
	JTable table;
	Vector<ShopDto> list;

	public ShopListFrom() {
		super("상품 전체 리스트");

		this.setBounds(200, 100, 700, 400);
		initDesign();
		this.setVisible(true);
	}

	public void initDesign() {
		this. setLayout(null);
		//db로부터 목록부터 얻기
		list = dbModel.getAllSangpums();
		
		
		//table
		String [] title = {"NO.", "상품명", "수량", "단가", "총금액", "구입일"};
		model = new DefaultTableModel(title, 0);
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		js.setBounds(10, 10, 500, 270);
		this.add(js);
		
		//이미지 넣는 위치
		draw.setBounds(520, 50, 160, 220);
		this.add(draw);
		
		//데이터 출력해주는 메서드
		this.dataWrite();
		
		//출력된 데이터 이벤트 주기 ..>익명내부 클래스로 작업
		table.addMouseListener(new MouseAdapter() { //필요한 1개만 받기 위해서
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//행번호얻기 
				int row = table.getSelectedRow();
				
				//list에서 해당하는 dto를 꺼내서 거기에서 이미지명을 얻기
				imageName = list.get(row).getPhoto();
				
				//이미지 나오게하는 메서드 호출
				draw.repaint();
				
				super.mouseClicked(e);
			}
			
		});

	}
	
	//데이터 출력해주는 메서드
	public void dataWrite() {
		//테이블 초기화는 테이블 기존 데이터 삭제
		model.setRowCount(0);
		
		//테이블에 데이터 추가하기
	    for(ShopDto dto : list) { //vector에 클래스를 썻기 떄문에 클래스 명을 써서 사용
	    	Vector<String> data = new Vector<String>();
	    	
	    	data.add(dto.getNum());
	    	data.add(dto.getSangpum());
	    	data.add(String.valueOf(dto.getSu()));
	    	data.add(String.valueOf(dto.getDan()));
	    	data.add(String.valueOf(dto.getSu()* dto.getDan()));
	    	data.add(String.valueOf(dto.getGuipday()));
	    	
	    	//테이블 모델에 추가
	    	model.addRow(data);
	    	
	    }
	}


	// 내부 클래스 만들기 (이미 상속을 받고 있기 때문에 클래스 메서드와 같은 성상에서만 만들 수 있음)
	class ImageDraw extends Canvas {
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			
			if(imageName != null) {
				Image image = new ImageIcon(imageName).getImage();
				g.drawImage(image, 0, 0, 160, 200, this);
			}
		}

	}

//	public static void main(String[] args) {
//		new ShopListFrom();
//
//	}

}
