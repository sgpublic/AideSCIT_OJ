package io.github.sgpublic.aidescit.api.exceptions

import org.springframework.security.authentication.BadCredentialsException

/**
 * 密码格式错误，用户传入密码未加盐的情况下抛出。
 */
class InvalidPasswordFormatException: BadCredentialsException("密码格式错误")