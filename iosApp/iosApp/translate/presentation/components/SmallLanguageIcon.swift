//
//  SmallLanguageIcon.swift
//  iosApp
//
//  Created by Evan Dwyer on 4/22/24.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI
import shared

struct SmallLanguageIcon: View {
    var language: UiLanguage
    var body: some View {
        Image(uiImage: UIImage(named: language.imageName.lowercased())!)
            .resizable()
            .frame(width: 30, height: 30)
    }
}
