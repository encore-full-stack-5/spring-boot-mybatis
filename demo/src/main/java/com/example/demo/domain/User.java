package com.example.demo.domain;


import lombok.*;

@AllArgsConstructor
@Getter @NoArgsConstructor
@ToString @EqualsAndHashCode
@Builder @Setter
public class User {
    private Long id;
    private String name;
    private String password;
    private String nickname;
}
