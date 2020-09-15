/**
 * The login object class.
 * @author William Knox
 */

package com.slate.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String email;
    private String password;
    @OneToOne
    private Actor actor;

    public Login() {
    }

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	/**
	 * Equals is based on email and password.
	 */
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return email.equals(login.email) &&
                password.equals(login.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }
}
