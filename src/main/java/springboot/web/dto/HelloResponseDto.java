package springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//	@Getter : ����� �ʵ��� get �޼��带 ����
//	@RequiredArgsConstructor : final�� ����� �ʵ尡 ���Ե� �����ڸ� ����
//  ��) public HelloResponseDto(String name, int amount) { ... }
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
	private final String name;
	private final int amount;
}
