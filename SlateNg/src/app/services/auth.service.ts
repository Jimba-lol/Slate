import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private BASE_URL = 'https://localhost:8888/';

  constructor(private http: HttpClient) { }

  getToken() : string {
    return localStorage.getItem('token');
  }

  logIn(username: string, password: string) {
    const url = `${this.BASE_URL}/login`;
    return this.http.post<User>(url, {username, password});
  }

  signUp(username: string, password: string) {
    const url = `${this.BASE_URL}/signup`;
    return this.http.post<User>(url, {username, password});
  }
}
