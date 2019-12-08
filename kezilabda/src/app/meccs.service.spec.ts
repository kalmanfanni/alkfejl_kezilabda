import { TestBed } from '@angular/core/testing';

import { MeccsService } from './meccs.service';

describe('MeccsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MeccsService = TestBed.get(MeccsService);
    expect(service).toBeTruthy();
  });
});
