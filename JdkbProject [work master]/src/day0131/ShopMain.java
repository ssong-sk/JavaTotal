package day0131;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShopMain extends JFrame implements ActionListener{
	JButton btnAdd, btnDel, btnUpdate, btnList;
	ShopDbModel dbModel = new ShopDbModel();
	
	public ShopMain() {
		super("ShopMain");
		
		this.setBounds(200, 100, 400, 400);
		initDesign();
		this.setVisible(true);
	}
	

	public void initDesign() {
		this.setLayout(new GridLayout(2, 2));
		//버튼생성
		btnAdd = new JButton("상품추가");
		btnDel = new JButton("상품삭제");
		btnUpdate = new JButton("상품수정");
		btnList = new JButton("상품목록");
		
		this.add(btnAdd);
		this.add(btnDel);
		this.add(btnUpdate);
		this.add(btnList);
		
		//이벤트
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnList.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob == btnAdd) {
			ShopAddForm add = new ShopAddForm();
		}
		else if(ob == btnDel) {
			//System.out.println("del");
			String num = JOptionPane.showInputDialog("삭제할 num을 입력해주세요");
			//dbModel.deleteSangpum(num);
		}
		else if (ob == btnUpdate) {
			System.out.println("up");
		}
		else if (ob == btnList) {
			//System.out.println("list");
			ShopListFrom listeForm = new ShopListFrom();
		}
		
	}
	
	public static void main(String[] args) {
		new ShopMain();

	} 

}
