package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//subList() : arrayList���� �Ϻθ� �̾� ���ο� �迭 ����
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		print(list1, list2);
		
		//Collection : �������̽� / Collections : ��ƿŬ����
		//�������� ����
		Collections.sort(list1);
		Collections.sort(list2);
		
		//�������� ���� �� ������ -> ��������
		Collections.reverse(list1);
		
		print(list1, list2);
		
		//ContainsAll() : ��� ��Ұ� ��� ���ԵǾ� �ִ��� Ȯ��
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		//add() : ������ �߰� / ��ġ(�ε���)�� ���� ����
		list2.add("B");
		list2.add("C");
		
		list2.add(3, "A");
		
		print(list1, list2);
		
		//set() : �ش� ��ġ(�ε���)�� �ִ� ������ ����
		list2.set(3, "AA");
		print(list1, list2);
		
		//indexOf() : ������ ��ü�� ��ġ(�ε���)�� �˷���
		list1.add(0, "1");
		System.out.println("index = " + list1.indexOf("1"));
		System.out.println("index = " + list1.indexOf(1));
		
		print(list1, list2);
		
		//remove() : �ش� �ε����� ���� ����
		list1.remove(1); // 1�� �ε��� ����
		list1.remove(new Integer(1)); //���� 1 ����
		
		print(list1, list2);
		
		//retainAll() : ��ġ�� �κи� ����� �������� ����
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		
		print(list1, list2);
		
		//��ü ����
//		for(int i = list2.size()-1; i>=0; i--) {
//			list2.remove(i);
//		}
		
		//list2���� list1�� ���Ե� ��ü���� ����
		for(int i = list2.size()-1; i>=0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		print(list1, list2);
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
