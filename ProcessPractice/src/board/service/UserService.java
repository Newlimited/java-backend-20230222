package board.service;

import board.common.constant.ResponsMessage;
import board.dto.reqeuset.user.SignInDto;
import board.dto.reqeuset.user.SignUpDto;
import board.dto.response.ResponseDto;
import board.dto.response.user.SignInResponseDto;
import board.entity.User;
import board.repository.UserRepository;

public class UserService {
	private UserRepository userRepository;

	public UserService() {

		userRepository = new UserRepository();

	}

	public ResponseDto<Boolean> signUp(SignUpDto dto) {
		String email = dto.getEmail();
		String password = dto.getPassword();
		String passwordCheck = dto.getPasswordCheck();

		boolean hasEmail = userRepository.existsByEmail(email);
		if (hasEmail)
			return new ResponseDto<Boolean>(false, ResponsMessage.EXIST_EMAIL, false);

		if (!password.equals(passwordCheck)) {
			return new ResponseDto(false, ResponsMessage.PASSWORD_NOT_MATCH, false);
		}
		User user = new User(dto);
		userRepository.save(user);

		return new ResponseDto<Boolean>(true, ResponsMessage.SUCCESS, true);
	}

	public ResponseDto<SignInResponseDto> signIn(SignInDto dto) {

		SignInResponseDto data = null;

		String email = dto.getEmail();
		String password = dto.getPassword();

		User user = userRepository.findByEmail(email);
		if (user == null)
			return new ResponseDto<>(false, ResponsMessage.FAIL_SIGN_IN, null);
		boolean isEqualPassword = user.getPassword().equals(password);
		if (!isEqualPassword)
			return new ResponseDto<>(false, ResponsMessage.FAIL_SIGN_IN, null);
		data = new SignInResponseDto(user);
		return new ResponseDto(true, ResponsMessage.SUCCESS, data);

	}
}
