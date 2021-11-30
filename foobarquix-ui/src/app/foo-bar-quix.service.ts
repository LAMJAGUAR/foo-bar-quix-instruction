import template from 'lodash/template';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from './../environments/environment';

export const ConversionWS = {
  convertNumber: environment.apiUrl + '/foo-bar-quix/${inputNumber}'
}

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {

  constructor(private http: HttpClient) { }

  convertNumber(inputNumber: number): Observable<any> {
    const compiledUrl = template(ConversionWS.convertNumber);
    return this.http.get(compiledUrl({ 'inputNumber': inputNumber }));
  }

}
