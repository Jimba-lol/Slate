import { User } from '../../models/user';
import { AuthActionTypes, All } from '../user.actions';

export interface State {
    isAuthenticated: boolean;
    user: User | null;
    errorMessage: string | null;
};

export const initialState : State = {
    isAuthenticated: false,
    user: null,
    errorMessage: null,
};

export function reducer(state = initialState, action: All): State {
    switch(action.type) {
        case AuthActionTypes.LOGIN_SUCCESS: {
            return {
                ...state,
                isAuthenticated: true,
                user: {
                    token: action.payload.token,
                    email: action.payload.email,
                },
                errorMessage: null
            }
        }
        case AuthActionTypes.LOGIN_FAILURE: {
            return {
                ...state,
                isAuthenticated: false,
                user: {
                    token: null,
                    email: null,
                },
                errorMessage: 'Login Failure',
            }
        }
        default: {
            return state;
        }
    }
}