package com.study.godofjava.chapter15;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main test = new Main();

	}

	public int solution(String s) {
		int answer = 0;

		if (s == null) {
			return 0;
		}

		String[] str = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < str.length; i++)
			s = s.replace(str[i], Integer.toString(i));

		answer = Integer.parseInt(s);

		return answer;
	}

	public int solution(int left, int right) {
		int answer = 0;
		int qe;// ���� ���� �����ϱ� ���� �ʱ� ���� 1
		int[] arr = new int[right - left + 1];

		for (int i = 0; i < arr.length; i++) { // �Ѱܿ� ���� �迭�� ������� �ݺ���
			arr[i] = left + i;
			qe = 1;

			for (int j = 1; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					qe++; // ���� 0���� ������ ��� �ش� ���� �����
				}
			}

			if (qe % 2 == 0) {
				answer += arr[i];
			} else {
				answer -= arr[i];
			}
		}
		return answer;
	}

	public void solutionTest(int num, int num2) {
		int result = 0;
		int qe;// ���� ���� �����ϱ� ���� �ʱ� ���� 1
		int[] arr = new int[num2 - num + 1];

		for (int i = 0; i < arr.length; i++) { // �Ѱܿ� ���� �迭�� ������� �ݺ���
			arr[i] = num + i;
			qe = 1;

			for (int j = 1; j < arr[i]; j++) {
				if (arr[i] % j == 0) {
					qe++; // ���� 0���� ������ ��� �ش� ���� �����
				}
			}

			if (qe % 2 == 0) {
				result += arr[i];
			} else {
				result -= arr[i];
			}
		}
	}

	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length + 1];
		int no = 0;

		for (int i = 0; i < numbers.length - 1; i++) {

			for (int j = i + 1; j < numbers.length; j++) {
				int result = numbers[i] + numbers[j]; // ���� ���Ѵ�.
				boolean check = false; // ���� �ߺ����� Ȯ���ϱ� ����

				for (int k = 0; k < answer.length; k++) { // �� �ߺ��� ã�Ƴ���. �ݺ����� ��� ���� true �� ������.
					if (answer[k] == result) {
						check = false;
						break;

					} else {
						check = true;
					}
				}

				if (check) {
					answer[no] = result;
					no++;
				}
			}
		}
		Arrays.sort(answer);
		return answer;
	}

}
