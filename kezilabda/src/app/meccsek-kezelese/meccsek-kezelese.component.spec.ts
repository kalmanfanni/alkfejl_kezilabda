import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MeccsekKezeleseComponent } from './meccsek-kezelese.component';

describe('MeccsekKezeleseComponent', () => {
  let component: MeccsekKezeleseComponent;
  let fixture: ComponentFixture<MeccsekKezeleseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MeccsekKezeleseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MeccsekKezeleseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
