package board.controller;

import board.common.constant.HttpStatus;
import board.dto.reqeuset.user.SignInDto;
import board.dto.reqeuset.user.SignUpDto;
import board.dto.response.ResponseDto;
import board.dto.response.user.SignInResponseDto;
import board.service.UserService;

public class UserController {

	private UserService userService;

	public UserController() {
		userService = new UserService();
		
	}
	public void signUp(SignUpDto dto) {
		
		if(dto.validate()) {
			System.out.println(HttpStatus.BAD_REQUEST); 
//			System.out.println("400 Bad Request"); // 웹에서 dto에 필수값들을 정확히 받지 못햇을경우 400이란 코드가 반환된다.
			System.out.println("모든 값을 입력해 주세요");
			return;
		}
		ResponseDto<Boolean> response = userService.signUp(dto);
		System.out.println(response.toString());
	}
	public void signIn(SignInDto dto) {
		if(dto.validate()) {
			System.out.println(HttpStatus.BAD_REQUEST);
			return;
		}
		ResponseDto<SignInResponseDto> response = userService.signIn(dto);
		System.out.println(response.toString());
	}
}
