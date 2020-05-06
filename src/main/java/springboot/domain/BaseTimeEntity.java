package springboot.domain;

import java.time.LocalDateTime;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
// �ش� Ŭ����(BaseTimeEntity)�� ���ǵ� �ʵ�(createdDate, modifiedDate)�� 
// �ش� Ŭ������ ��ӹ��� JPA ��ƼƼ Ŭ�������� �÷����� �νĵǵ��� ����
@MappedSuperclass
// �ش� Ŭ����(BaseTimeEntity)�� Auditing ����� ����
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
	
	// ��ƼƼ�� �����Ǿ� ����� �� �ð��� �ڵ����� ����
	@CreatedDate
	private LocalDateTime createdDate;
	
	// ��ȸ�� ��ƼƼ�� ���� ������ �� �ð��� �ڵ����� ����
	@LastModifiedDate
	private LocalDateTime modifiedDate;
}
