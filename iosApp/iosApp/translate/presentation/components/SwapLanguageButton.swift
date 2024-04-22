//
//  SwapLanguageButton.swift
//  iosApp
//
//  Created by Evan Dwyer on 4/22/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI


struct SwapLanguageButton: View {
    var onClick: () -> Void
    var body: some View {
        Button(action: onClick) {
            Image(uiImage: UIImage(named: "swap_languages")!)
                .padding()
                .background(Color.primaryColor)
                .clipShape(Circle())
        }
    }
}

#Preview {
    SwapLanguageButton(onClick: {})
}
