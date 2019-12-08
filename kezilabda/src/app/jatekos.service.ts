import { Injectable } from '@angular/core';
import {Jatekos } from 'src/app/domain/jatekos';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class JatekosService {

  jatekosok: Jatekos[] = [];
  
  filteredJatekosok: Jatekos[] = this.jatekosok;

  constructor(
    private http: HttpClient
  ) { }

  async getJatekosok() {
    const jatekosok = await (this.http.get('jatekos')
      .toPromise() as Promise<any[]>);
    this.filteredJatekosok = this.jatekosok = jatekosok.map(this.createJatekosModel);
    
  }

  /*async getIssue(issueId: number): Promise<Issue> {
    const issue = await (this.http.get(`issues/${issueId}`)
      .toPromise() as Promise<any>);
    return this.createIssueModel(issue);
  }

  async createIssue(issue: Issue): Promise<any> {
    await this.http.post('issues', issue).toPromise();
  }

  async modifyIssue(issue: Issue): Promise<any> {
    await this.http.patch(`issues/${issue.id}`, issue).toPromise();
  }

  filterChange(filterValue: string) {
    if (typeof filterValue === 'string') {
      if (filterValue === '') {
        this.filteredIssues = this.issues;
      } else {
        // Lehet ciklussal is :)
        this.filteredIssues = this.issues.filter(issue => {
          return issue.status === filterValue;
        });
      }
    }
  }
*/
  private createJatekosModel(jatekos: any): Jatekos {
    return {
      ...jatekos
    } as Jatekos;
  }
}
