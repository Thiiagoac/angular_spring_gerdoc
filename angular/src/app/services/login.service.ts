import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { HttpClient } from '@angular/common/http';
import { CookieService } from 'ngx-cookie-service';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient, private cookieService: CookieService, private router: Router) { }

  private Token: string = 'UNKNOWN'
  public username: string;

  Url = environment.url + 'login';

  sair() {
    this.cookieService.delete('JwtToken');
    this.cookieService.delete('token');
    this.router.navigate(['/']);
  }

  setNameUser() {
    this.username = this.cookieService.get('emailUser').split('@')[0];
  }

  getToken() {
    if (!this.Token && this.cookieService.check('JwtToken')) {
      this.Token = this.cookieService.get('JwtToken');
    }
    return this.Token;
  }

  postAuthentication(email: string, senha: string) {
    var observable = this.http.post(this.Url,
      { email, senha },
      {
        observe: 'response',
        responseType: 'text'
      });
    observable.subscribe(tokenDto => {
      this.Token = tokenDto.body;
      this.cookieService.set('JwtToken', this.Token);
      this.cookieService.set('emailUser', email);
      this.setNameUser();
      console.log(this.cookieService.get('JwtToken'));
      console.log(this.cookieService.get('emailUser').split('@')[0]);
    })
    return observable;
  }
}
